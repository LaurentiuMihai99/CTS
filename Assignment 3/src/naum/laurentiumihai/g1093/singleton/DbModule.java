package naum.laurentiumihai.g1093.singleton;

public class DbModule {
	public DbModule() {
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
