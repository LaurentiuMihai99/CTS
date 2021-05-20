package cts.naum.laurentiu.g1093.pattern.command;

public class AsyncTask implements AsyncTaskInterface {

	BankModule module;
	String sourceAccount;
	String destinationAccount;
	double value;
	String destinationBank;
	int priority;
	
	public AsyncTask(BankModule module, String sourceAccount, String destinationAccount, double value,
            String destinationBank, int priority) {
		super();
		this.module = module;
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
		this.value = value;
		this.destinationBank = destinationBank;
		this.priority = priority;
	}


	@Override
	public void startTask() {
		this.module.processTransaction(sourceAccount,destinationAccount,value,destinationBank);
	}
}
