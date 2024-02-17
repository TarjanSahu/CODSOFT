package Exceptions;

public class InvalidInputException extends Exception {

	public InvalidInputException(String message) {
		super(message);
	}
	
	public InvalidInputException()
	{
		super("Invailid Input....");
	}
}
