package ro.ase.csie.cts.seminar4.stage3.services;

import ro.ase.csie.cts.seminar3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;

public interface ValidatorInterface {

	public void validatePrice(float price) throws InvalidPriceException;
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
	
}
