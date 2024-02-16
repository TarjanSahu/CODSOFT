package tester;

import java.util.Scanner;
import com.app.banking.*;

import exceptionAndValidations.InvalidInputException;

public class Tester {

	public static void main(String[] args) throws InvalidInputException {		
		 BankAccount bankAccount = new BankAccount("Vikash", 25000);
	        ATM atm = new ATM(bankAccount);
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nWelcome to the ATM. Please select an option:");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter withdrawal amount:");
	                    double withdrawAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawAmount);
	                    break;
	                case 2:
	                    System.out.println("Enter deposit amount:");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;
	                case 3:
	                    atm.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Exiting ATM. Thank you!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}