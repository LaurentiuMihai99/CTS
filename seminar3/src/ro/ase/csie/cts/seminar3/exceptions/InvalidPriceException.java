package ro.ase.csie.cts.seminar3.exceptions;

public class InvalidPriceException extends Throwable {
	
	public String message;
	
	public InvalidPriceException(String message) {
		this.message = message;
	}
}
