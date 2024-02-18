package tester;

import java.util.InputMismatchException;

import com.app.game.NumberGuessingGame;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean playAgain = true;

		while (playAgain) {
			NumberGuessingGame game = new NumberGuessingGame();
			System.out.println("Welcome to the Number Guessing Game!");
			System.out.println("I have selected a number between 1 and 100.\nYou have Maximum "+game.getMAX_ATTEMPTS()+" Attempts.\nCan you guess it?");

			while (!game.isGameOver()) {
				try {
					System.out.print("Enter your guess: ");
					int userGuess = sc.nextInt();

					if (userGuess < 1 || userGuess > 100) {
						System.out.println("Please enter a number between 1 and 100.");
						continue;
					}

					System.out.println(game.checkGuess(userGuess));

					if (game.isGuessedCorrectly()) {
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input! Please enter a valid number.");
					sc.nextLine(); // Clear the input buffer
				}
			}
			//After the guessing correct number
			System.out.println("You took " + game.getAttempts() + " attempts to guess the number.");

			if (!game.isGuessedCorrectly()) {
				System.out.println("The correct number was: " + game.getTargetNumber());
			}

			System.out.print("Do you want to play again? (yes/no): ");
			String playAgainInput = sc.next();
			playAgain = playAgainInput.equalsIgnoreCase("yes");
		}

		System.out.println("Thanks for playing! Goodbye.");
		sc.close();
	}

}
