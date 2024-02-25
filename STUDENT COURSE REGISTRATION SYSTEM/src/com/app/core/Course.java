package com.app.core;

public class Course {
	private int CourseCode;
	private String title;
	private String description;
	private int capacity;
	private String schedule;
	
	public Course(int CourseCode, String title, String description, int capacity, String schedule) {
		super();
		this.CourseCode = CourseCode;
		this.title = title;
		this.description = description;
		this.capacity = capacity;
		this.schedule = schedule;
	}
	
	
	
    public void displayCourseDetails() {
        System.out.println("\n		Course Code: " + CourseCode);
        System.out.println("		Title: " + title);
        System.out.println("		Description: " + description);
        System.out.println("		Capacity: " + capacity);
        System.out.println("		Schedule: " + schedule+"\n");
    }

    // displayCourseDetailsForStudents Function hide the capacity if the course
    public void displayCourseDetailsForStudents() {
        System.out.println("\n		Course Code: " + CourseCode);
        System.out.println("		Title: " + title);
        System.out.println("		Description: " + description);
        System.out.println("		Schedule: " + schedule+"\n");
    }


	public int getCourseCode() {
		return CourseCode;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
