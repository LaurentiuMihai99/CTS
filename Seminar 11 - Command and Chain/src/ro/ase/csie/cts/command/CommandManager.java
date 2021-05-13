package ro.ase.csie.cts.command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
	List<AsyncTaskInterface> tasks = new ArrayList<>();
	String name;
	
	public CommandManager(String name) {
		super();
		this.name = name;
	}
	
	public void addAsyncTask(AsyncTaskInterface task) {
		this.tasks.add(task);
	}
	
	public void doNextTask() {
		//determine the task with the biggest priority
		if (tasks.size() > 0) {
			AsyncTaskInterface task = tasks.get(0);
			task.startTask();
			tasks.remove(0);
		}
	}
}
