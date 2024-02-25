package com.app.core;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int studentID;
	private String name;
    private List<Course> registeredCourses;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public void dropCourse(Course course) {
        registeredCourses.remove(course);
    }
    
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.print("Registered Courses: ");
        if(registeredCourses.isEmpty()) {
        	System.out.print("Student not yet inrolled any courses");
        }else {
        for (Course course : registeredCourses) {
            course.displayCourseDetailsForStudents();
        }
        }
    }

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(List<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
	

}
