package ro.ase.csie.dp.singleton;

public class TestGame {

	public static void main(String[] args) {
		RESTBackend backend = RESTBackend.getRESTBackend();
		UiModule uiModule = new UiModule();
		PlayerModule playerModule = new PlayerModule();
	}

}
