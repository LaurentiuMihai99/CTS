package naum.laurentiumihai.g1093.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//Only one line should appear in output if the singleton works
		RESTBackend backend = RESTBackend.getRESTBackend();
		RESTBackend backend2 = RESTBackend.getRESTBackend();

	}

}
