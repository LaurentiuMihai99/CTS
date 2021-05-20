package cts.naum.laurentiu.g1093.pattern.command;

public class Bank extends BankModule {

	@Override
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {
		System.out.println("Processing Transaction for " + destinationBank);
		
	}

}
