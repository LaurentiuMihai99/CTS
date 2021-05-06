package ro.ase.csie.proxy;

public class TestProxy {
	
	public static void main(String[] args) {
		LoginInterface loginModule = new LoginModule("10.0.0.1", "users");
		
		if (loginModule.login("admin","admin1234")) {
			System.out.println("Hello Admin!");
		}
		else {
			System.out.println("Wrong Credentials!");
		}
		
		loginModule = new LoginWith2FactorAuth(loginModule);
		
		String[] passwords = new String[] {"1234", "123456", "admin", "root", "admin1234"};
		for(String pass : passwords) {
			if (loginModule.login("admin", pass)) {
				System.out.println("Found it! Is " + pass);
				break;
			}
		}
	}
}
