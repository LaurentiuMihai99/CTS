package naum.laurentiumihai.g1093.factory;

public class TwoRoomsApt extends AbstractListing {

	public TwoRoomsApt(String name, String URL, String specs) {
		super(name, URL, specs);
	}

	@Override
	public void displayRooms() {
		System.out.println("2 rooms");
	}

}
