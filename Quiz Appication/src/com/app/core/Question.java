package com.app.core;

import java.util.List;

public class Question {
	
	private String question;
	private List<String> options;
	private int correctOption;
	
	public Question(String question, List<String> options, int correctOption) {
		super();
		this.question = question;
		this.options = options;
		this.correctOption = correctOption;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOption(List<String> options) {
		this.options = options;
	}

	public int getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}
	
	

}
