package com.app.game;

import java.util.Random;

public class NumberGuessingGame {
	private int targetNumber;
	private int attempts;
	private boolean guessedCorrectly;
	private final int MAX_ATTEMPTS = 7;

	public NumberGuessingGame() {
		Random random = new Random();
		targetNumber = random.nextInt(100) + 1;
		attempts = 0;
		guessedCorrectly = false;
	}

	public boolean isGuessedCorrectly() {
		return guessedCorrectly;
	}

	public int getAttempts() {
		return attempts;
	}

	public int getTargetNumber() {
		return targetNumber;
	}
	
	public int getMAX_ATTEMPTS() {
		return MAX_ATTEMPTS;
	}

	public String checkGuess(int userGuess) {
		
		System.out.println("Attempt No. : "+ ++attempts);
		if (userGuess == targetNumber) {
			guessedCorrectly = true;
			return "Congratulations! You guessed the number " + targetNumber + " correctly!";
		} else if (userGuess < targetNumber) {
			return "Too low! Try again.";
		} else {
			return "Too high! Try again.";
		}
	}

	public boolean isGameOver() {
		return attempts >= MAX_ATTEMPTS || guessedCorrectly;
	}
}
