package cts.naum.laurentiu.g1093.pattern.command;

public class TestCommand {

	public static void main(String[] args) {
		
		CommandManager manager = new CommandManager("Transactions");
		
		manager.addAsyncTask(new AsyncTask(new Bank(), "ABCD123", "ABCD123", 100, "ING", 0));
		manager.addAsyncTask(new AsyncTask(new Bank(), "ABCD123", "DEFG2", 200, "BRD", 0));
		manager.addAsyncTask(new AsyncTask(new Bank(), "ABCD123", "ABCD12323", 100, "ING", 0));
		
		manager.doNextTask();
		manager.doNextTask();
		manager.doNextTask();
	}

}
