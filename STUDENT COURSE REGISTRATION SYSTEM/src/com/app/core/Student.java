package com.app.core;

public class Student {
	
	private int id;
	private String name;
	private Course courseName;
	
	public Student(int id, String name, Course courseName) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourseName() {
		return courseName;
	}

	public void setCourseName(Course courseName) {
		this.courseName = courseName;
	}
	
	

}
