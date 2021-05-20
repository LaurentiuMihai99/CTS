package cts.naum.laurentiu.g1093.pattern.command;

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
		//We assume we determine the bank from the first 4 letters of an account
		boolean foundInternal = false;
		for (AsyncTaskInterface task : tasks) {
			AsyncTask taskDowncasted = (AsyncTask) task;
			if(taskDowncasted.sourceAccount.subSequence(0, 3).
					equals(taskDowncasted.destinationAccount.subSequence(0, 3))) {
				foundInternal = true;
				taskDowncasted.startTask();
				tasks.remove(task);
			}
		}
		
		if(tasks.size() > 0 && foundInternal == false) {
			AsyncTaskInterface task = tasks.get(0);
			task.startTask();
			tasks.remove(0);
		}
	}
}
