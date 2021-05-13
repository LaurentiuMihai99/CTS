package ro.ase.csie.cts.command;

public class UpdateModule implements GameModuleInterface {

	@Override
	public void doTheTask(String details) {
		System.out.println("Updating " + details);
		
	}

}
