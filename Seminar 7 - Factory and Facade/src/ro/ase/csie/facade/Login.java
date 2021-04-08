package ro.ase.csie.facade;

public class Login {
	String userName;
	String password;
	
	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public void login() {
		
	}
	
	public UserProfile getUserProfile() {
		return new UserProfile();
	}
	
}
