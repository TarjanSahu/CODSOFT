package com.app.core;

import java.time.LocalDate;

public class Course {
	//  Store course information, including course code, title,
	//description, capacity, and schedule.
	private int id;
	private Course title;
	private String description;
	private int capacity;
	private LocalDate schedule;
	
	public Course(int id, Course title, String description, int capacity, LocalDate schedule) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.capacity = capacity;
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", capacity=" + capacity
				+ ", schedule=" + schedule + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course getTitle() {
		return title;
	}

	public void setTitle(Course title) {
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

	public LocalDate getSchedule() {
		return schedule;
	}

	public void setSchedule(LocalDate schedule) {
		this.schedule = schedule;
	}
	
	

}
