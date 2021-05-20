package cts.naum.laurentiu.g1093.pattern.factory;

public class AccountFactory {
	public static BankAccount getBankAccount(AccountType accountType, double balance, String id) {
		BankAccount bankAccount = null;
		
		switch (accountType) {
		case DEBIT:
			bankAccount = new DebitAccount(balance, id, false, false);
			break;
		case CREDIT:
			bankAccount = new CreditAccount(balance, id, 0, 0);
			break;
		case JUNIOR:
			bankAccount = new JuniorAccount(balance, id);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return bankAccount;
	}
}
