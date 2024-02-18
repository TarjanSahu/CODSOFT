package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Course;
import Exceptions.InvalidInputException;

public class SampleDataCourse {

	 public static List<Course> populateCourseList() throws InvalidInputException
	   {
		   List<Course> coursetList = new ArrayList<>();
                              //   int id, String title,    String description,      int capacity,     String schedule
		   coursetList.add(new Course(101, "CS", "Fundamental concepts of programming",2, "Mon/Wed/Fri 10:00 AM - 11:30 AM"));
		   coursetList.add(new Course(102, "MATH", "Advanced calculus topics", 2, "Tue/Thu 1:00 PM - 2:30 PM"));
		   coursetList.add(new Course(103, "English", "Grammer,Vocabulary", 2, "Tue/Thu 4:00 PM - 6:00 PM"));
		   return coursetList;
		   
	   }
		   
		   
}
