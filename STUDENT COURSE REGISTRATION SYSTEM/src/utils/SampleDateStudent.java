package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Student;

import Exceptions.InvalidInputException;

public class SampleDateStudent {
	
   public static List<Student> populateStudentsList() throws InvalidInputException
   {
	   List<Student> studentList = new ArrayList<>();
	   
		studentList.add( new Student(1, "Anshul"));
		studentList.add( new Student(2, "Vikash"));
		studentList.add( new Student(3, "Ravi"));
		return studentList;
	
   }
}
