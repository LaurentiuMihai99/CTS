package ro.ase.csie.dp.singleton;

public class PlayerModule {
	public PlayerModule() {
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
