package com.app.core;

import java.util.ArrayList;
import java.util.List;

import Exceptions.InvalidInputException;

public class CourseRegistrationSystem {
	private List<Course> courses;
	private List<Student> students;
	
	public CourseRegistrationSystem() {
		courses = new ArrayList<>();
		students = new ArrayList<>();
	}
	
	// Add Course in Course List
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	//Add Student in Student List
	public void registerStudent(Student student) {
		students.add(student);
	}
	
	public void registerCourse(int studentId, int courseCode) throws InvalidInputException{
        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);
        if (student != null && course != null) {
        	    enrollStudentInCourse(student,course);             
            } else {
             System.out.println("Please Enter Vailid Student Id and Course Code");
              //  throw new InvalidInputException("Please Enter valid Student Id and Course Code");
            }
        }

	
	public void enrollStudentInCourse(Student student, Course course){
        if (course.getCapacity() > 0) {
            student.registerCourse(course);
            course.setCapacity(course.getCapacity() - 1);
            System.out.println("Course " + course.getTitle() + " registered successfully for student " + student.getName());
        } else {
         	System.out.println("Course is full. Cannot enroll student");
        }
    }
    
	public void dropCourseForStudent(Student student, Course course) {
        student.dropCourse(course);
        course.setCapacity(course.getCapacity() + 1);
    }

	public void dropCourse(int studentId, int courseCode){
        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);
        if (student != null && course != null) {
            student.dropCourse(course);
            course.setCapacity(course.getCapacity() + 1);
            System.out.println("Course " + course.getTitle() + " dropped successfully for student " + student.getName());
        } else {
        	System.out.println("Student or course not found.");
        }
    }

	public void displayAvailableCourses() {
        System.out.println("Available Courses : ");
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }

    public void displayStudentDetails(Student student) {
        student.displayStudentDetails();
    }
    
//  Find Student by ID
	public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentID() == studentId) {
                return student;
            }
        }
        return null;
    }
	
   // (Helper Method)Find the Course by Course Code
    public Course findCourseByCode(int courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode()==(courseCode)) {
                return course;
            }
        }
        return null;
    }

}
