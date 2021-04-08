package ro.ase.csie.assignment;

import ro.ase.csie.assignment.exceptions.InvalidLoanValueException;

public class Account implements MonthlyRateInterface {
	public double loanValue;
	public double ratePercentage;	
	public int daysActive;
	public AccountType accountType;
	private final static int daysInYear = 365;
	private final static double brokerFee = 0.0125;
	
	public Account(double value, double rate, AccountType accountType) throws InvalidLoanValueException {
		if(value<0) {
			throw new InvalidLoanValueException("Loan Values less than 0 aren't supported");
		}
		this.loanValue = value;
		this.ratePercentage = rate;
		this.accountType = accountType;
	}
	
	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRatePercentage() {
		System.out.println("The rate percentage is " + this.ratePercentage);
		return this.ratePercentage;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*ratePercentage;
	}
	
	public void setLoanValue(double value) throws InvalidLoanValueException {
		if(value<0) {
			throw new InvalidLoanValueException("Loan Values less than 0 aren't supported");
		}
		loanValue = value;
	}
	
	@Override
	public String toString() {
		return "Loan: " + this.loanValue +
			   "; rate: " + this.ratePercentage + 
			   "; days active:" + this.daysActive +
			   "; Type: " + this.accountType;
	}

	public static double getTotalFee(Account[] accounts) {
		double totalFee=0.0;
		Account	account;
		for	(int i=0;i<accounts.length;i++)	{
			account=accounts[i];
			if(account.accountType==AccountType.PREMIUM || 
			   account.accountType==AccountType.SUPER_PREMIUM) {
					totalFee += brokerFee * (account.loanValue * 
							Math.pow(account.ratePercentage,
									 account.daysActive/daysInYear) - account.loanValue);
			}
		}
		return totalFee;
	}	
}
