package ro.ase.csie.cts.seminar2.models;

import ro.ase.csie.cts.seminar2.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount {

	public static final double MIN_BALANCE = 100;
	
	public SavingsAccount(String iban) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void deposit(Double amount) throws InsufficientFundsException {
		this.balance += amount;
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		if (amount > this.balance) {
			throw new InsufficientFundsException("You need more money");
		}
		else {
			this.balance -= amount;
		}
	}

	@Override
	public void transfer(Account destination, Double amount) {
		this.withdraw(amount);
		destination.deposit(amount);
	}

	
	@Override
	public void addInterest(double interestPercentRate) {
		this.balance *= (1 + interestPercentRate/100);
	}
}
