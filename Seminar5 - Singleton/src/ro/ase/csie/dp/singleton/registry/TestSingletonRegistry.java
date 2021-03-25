package ro.ase.csie.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		RESTBackend backend1 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.2", "profile");

		if (backend1 == backend2) {
			System.out.println("Same object");
		}
		else {
			System.out.println("They are different");
		}
	}

}
