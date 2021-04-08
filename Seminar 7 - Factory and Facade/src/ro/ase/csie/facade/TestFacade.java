package ro.ase.csie.facade;

public class TestFacade {

	public static void main(String[] args) {
		GameServer server = new GameServer();
		server.connect();
		
		Login login = new Login("Player1", "2134");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		
		String profile = userProfile.getProfile();

		
		String facadeProfile = UserApiFacade.getUserProfile("player2", "124312321");
	}

}
