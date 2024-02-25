package com.app.core;

public class Course {
	//  Store course information, including course code, title,
	//description, capacity, and schedule.
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
    
    public void displayCourseDetailsForStudents() {
        System.out.println("\n		Course Code: " + CourseCode);
        System.out.println("		Title: " + title);
        System.out.println("		Description: " + description);
      //  System.out.println("		Capacity: " + capacity);
        System.out.println("		Schedule: " + schedule+"\n");
    }

	@Override
	public String toString() {
		return "Course [CourseCode=" + CourseCode + ", title=" + title + ", description=" + description + ", capacity=" + capacity
				+ ", schedule=" + schedule + "]";
	}
	

	public int getCourseCode() {
		return CourseCode;
	}

	public void setId(int CourseCode) {
		this.CourseCode = CourseCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Course other = (Course) obj;
//		return CourseCode == other.CourseCode;
//	}
	
	
	

}
