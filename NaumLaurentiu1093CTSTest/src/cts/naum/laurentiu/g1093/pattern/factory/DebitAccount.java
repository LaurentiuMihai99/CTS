package cts.naum.laurentiu.g1093.pattern.factory;

public class DebitAccount extends BankAccount {

	private boolean recievesSalary;
	private boolean hasOverdraft;
	
	public DebitAccount(double Balance, String Id, boolean recievesSalary, boolean hasOverdraft) {
		super(Balance, Id);
		this.recievesSalary = recievesSalary;
		this.hasOverdraft = hasOverdraft;
	}

	public boolean isRecievesSalary() {
		return recievesSalary;
	}

	public void setRecievesSalary(boolean recievesSalary) {
		this.recievesSalary = recievesSalary;
	}

	public boolean isHasOverdraft() {
		return hasOverdraft;
	}

	public void setHasOverdraft(boolean hasOverdraft) {
		this.hasOverdraft = hasOverdraft;
	}
}
