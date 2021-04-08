package ro.ase.csie.facade;

public class UserApiFacade {
	//The facade method
	public static String getUserProfile(String user, String pass) {
		GameServer server = new GameServer();
		server.connect();
		
		Login login = new Login("Player1", "2134");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		
		String profile = userProfile.getProfile();
		
		return profile;
	}
}
