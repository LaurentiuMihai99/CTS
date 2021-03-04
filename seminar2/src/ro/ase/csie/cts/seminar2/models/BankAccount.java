package ro.ase.csie.cts.seminar2.models;

public abstract class BankAccount extends Account {
	protected String iban;
	protected Double balance;
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	@Override
	public void deposit(Double amount) {
		
	}
	@Override
	public void withdraw(Double amount) {
		
	}
	@Override
	public void transfer(Account destination, Double amount) {
		
	}
	
	
}
