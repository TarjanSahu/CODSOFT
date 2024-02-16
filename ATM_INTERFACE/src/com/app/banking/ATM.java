package com.app.banking;

import exceptionAndValidations.InvalidInputException;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) throws InvalidInputException {
        if (amount <= 0) {
        	throw new InvalidInputException("Invalid amount. Please enter a positive value.");
        }

        if (amount > account.getBalance()) {
            throw new InvalidInputException("Insufficient funds");
        }

        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrawal of " + amount + " successful.");
    }

    public void deposit(double amount) throws InvalidInputException {
        if (amount <= 0) {
        	throw new InvalidInputException("Invalid amount. Please enter a positive value.");
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}
