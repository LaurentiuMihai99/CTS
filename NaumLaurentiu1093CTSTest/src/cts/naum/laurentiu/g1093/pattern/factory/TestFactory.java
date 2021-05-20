package cts.naum.laurentiu.g1093.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {
		BankAccount debitAccount = AccountFactory.getBankAccount(AccountType.DEBIT, 1000, "1");
		BankAccount creditAccount = AccountFactory.getBankAccount(AccountType.CREDIT, 500, "2");
		BankAccount juniorAccount = AccountFactory.getBankAccount(AccountType.JUNIOR, 25, "3");
		
		System.out.println(debitAccount.balance + " " + debitAccount.id + " " + ((DebitAccount) debitAccount).isRecievesSalary());
		System.out.println(creditAccount.balance + " " + creditAccount.id + " " + ((CreditAccount) creditAccount).getNoRates());
		System.out.println(juniorAccount.balance + " " + juniorAccount.id);
	}

}
