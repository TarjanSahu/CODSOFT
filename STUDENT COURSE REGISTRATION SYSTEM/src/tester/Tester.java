package tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.Course;
import com.app.core.CourseRegistrationSystem;
import com.app.core.Student;

import utils.SampleDataCourse;
import utils.SampleDateStudent;

public class Tester {
    public static void main(String[] args) {
    	try(Scanner sc = new Scanner(System.in)){
        CourseRegistrationSystem registrationSystem = new CourseRegistrationSystem();
        // Populate courses and students
        List<Course> courseList = SampleDataCourse.populateCourseList();
        List<Student> studentList = SampleDateStudent.populateStudentsList();
        
        for (Student student : studentList) {
        registrationSystem.registerStudent(student);
		}
        
        for (Course course : courseList) {
            registrationSystem.addCourse(course);
    	}
             
        while (true) {
            System.out.println("\n\nChoose an option:");
            System.out.println("1. Display available courses");
            System.out.println("2. Display Student Details");
            System.out.println("3. Register for a course");
            System.out.println("4. Drop a course");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                	registrationSystem.displayAvailableCourses();
                    break;
                case 2:
                	System.out.println("Enter student ID");
                	registrationSystem.displayStudentDetails(registrationSystem.findStudentById(sc.nextInt()));
                    break;
                case 3:
                    // Prompt for student ID and course code, then register
                    System.out.println("Enter student ID And course code:");
                    registrationSystem.registerCourse(sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    // Prompt for student ID and course code, then drop
                    System.out.println("Enter student ID And course code:");
                    registrationSystem.dropCourse(sc.nextInt(), sc.nextInt());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        }catch (Exception e) {
        	e.printStackTrace();
        }
    }
}