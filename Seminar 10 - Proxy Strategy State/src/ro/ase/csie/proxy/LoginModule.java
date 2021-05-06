package ro.ase.csie.proxy;

public class LoginModule implements LoginInterface {
	String serverIP;
	String dbConnection;
	
	public LoginModule(String serverIP, String dbConnection) {
		this.serverIP = serverIP;
		this.dbConnection = dbConnection;
	}
	
	@Override
	public boolean login(String username, String pass) {
		System.out.println("Connecting to the database: " + dbConnection);
		if (username.toLowerCase().equals("admin") && pass.equals("admin1234"))
			return true;
		else
			return false;
	}
	@Override
	public boolean checkServerStatus() {
		return true;
	}
	
	
}
