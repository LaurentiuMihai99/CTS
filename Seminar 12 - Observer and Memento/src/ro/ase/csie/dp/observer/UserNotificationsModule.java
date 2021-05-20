package ro.ase.csie.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		System.out.println("Popup: Connection is active");
	}

	@Override
	public void connectionDown() {
		System.out.println("Popup: Connection to the server is lost");
	}

}
