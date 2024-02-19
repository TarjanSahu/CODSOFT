package com.app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import exception.InvalidInputException;
import utils.SampleData;

public class Quiz {

	private List<Question> questions;
	private int score;
	private Scanner scanner;
	
	
	
	 public Quiz() {
		super();
		this.questions = new ArrayList<>();
		this.score = 0;
		this.scanner = new Scanner(System.in);
	}
	public void startQuiz() {
		 List<Question> questions;
		try {
			questions = SampleData.populateQuestionList();
		
	        System.out.println("Welcome to the Quiz!");
	        System.out.println("You will have 10 seconds to answer each question.");

	        for (Question question : questions) {
	            System.out.println("\n" + question.getQuestion());
	            for (String option : question.getOptions()) {
	                System.out.println(option);
	            }

	            System.out.print("Your answer (A/B/C/D): ");
	            String userAnswer = scanner.nextLine().toUpperCase();
	            
	            if (userAnswer.equals(getCorrectAnswerLetter(question.getCorrectOption()))) {
	                System.out.println("Correct!");
	                score++;
	            } else {
	                System.out.println("Incorrect.");
	            }

	            try {
	                TimeUnit.SECONDS.sleep(10); // Wait for 10 seconds before displaying the next question
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		

	        System.out.println("\nQuiz completed!");
	        System.out.println("Your final score: " + score + "/" + questions.size());
	    } catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	    private String getCorrectAnswerLetter(int correctOption) {
	        return switch (correctOption) {
	            case 1 -> "A";
	            case 2 -> "B";
	            case 3 -> "C";
	            case 4 -> "D";
	            default -> "";
	        };
	    }
	    
}
