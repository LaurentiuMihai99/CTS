package ro.ase.csie.dp.singleton;

public class UiModule {
	public UiModule() {
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
