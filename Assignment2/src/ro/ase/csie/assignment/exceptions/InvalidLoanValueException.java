package ro.ase.csie.assignment.exceptions;


public class InvalidLoanValueException extends Throwable {
	
	public String message;
	
	public InvalidLoanValueException(String message) {
		this.message = message;
	}
}