package ro.ase.csie.cts.seminar4.stage3.services;

import ro.ase.csie.cts.seminar3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorInterface {

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if (price <= 0) {
			throw new InvalidPriceException("The price is wrong");
		}
	}

	@Override
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {
		if (accountAgeInYears < 0) {
			throw new InvalidAccountAgeException("The account age is wrong");
		}
	}

}
