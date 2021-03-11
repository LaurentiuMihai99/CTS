package ro.ase.csie.cts.seminar3.exceptions;

public class InvalidAccountAgeException extends Throwable {
	
	public String message;
	
	public InvalidAccountAgeException(String message) {
		this.message = message;
	}
}
