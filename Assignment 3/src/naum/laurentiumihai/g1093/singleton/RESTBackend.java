package naum.laurentiumihai.g1093.singleton;

public class RESTBackend {
	String dbName;
	
	private static RESTBackend backend = null;
	
	private RESTBackend() {}
	private RESTBackend(String dbName) {
		this.dbName = dbName;
	}
	
	public static synchronized RESTBackend getRESTBackend() {
		if (backend == null) {
			String dbName = "REInvest";
			System.out.println("Opening dbConnection to: " + dbName);
			backend = new RESTBackend(dbName);
		}
		return backend;
	}
}
