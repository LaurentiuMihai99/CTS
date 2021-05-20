package ro.ase.csie.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		ServerConnectionModule connection = new ServerConnectionModule();
		
		BackupModule backup = new BackupModule();
		UserNotificationsModule notifications = new UserNotificationsModule();
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);

		connection.register(notifications);
		connection.register(backup);
		
		connection.detectConnectionStatusChange(ConnectionStatus.DOWN);
		
		connection.unregister(backup);
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
	}

}
