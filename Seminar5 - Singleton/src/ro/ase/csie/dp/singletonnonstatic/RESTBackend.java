package ro.ase.csie.dp.singletonnonstatic;

public class RESTBackend {
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	static { //Executed only once
		System.out.println("Is executed when the class is loaded by the JVM");
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro/cts";
	}
	
	private RESTBackend() {};
}
