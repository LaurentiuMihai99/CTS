package ro.ase.csie.cts.command;

public class TestCommand {

	public static void main(String[] args) {
		CommandManager manager = new CommandManager("Background tasks");
		
		manager.addAsyncTask(new AutoSaveModule(5), "Finishing current level", 0);
		manager.addAsyncTask(new AutoSaveModule(5), "Finishing current level", 0);
		
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
	}

}
