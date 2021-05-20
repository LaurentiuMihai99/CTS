package cts.naum.laurentiu.g1093.pattern.factory;

public class CreditAccount extends BankAccount {

	private int creditLimit;
	private int noRates;
	
	public CreditAccount(double Balance, String Id, int creditLimit, int noRates) {
		super(Balance, Id);
		this.creditLimit = creditLimit;
		this.noRates = noRates;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getNoRates() {
		return noRates;
	}

	public void setNoRates(int noRates) {
		this.noRates = noRates;
	}

	
}
