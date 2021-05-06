package naum.laurentiumihai.g1093.factory;

public class SingleRoomApt extends AbstractListing {

	public SingleRoomApt(String name, String URL, String specs) {
		super(name, URL, specs);
	}

	@Override
	public void displayRooms() {
		System.out.println("1 room");
	}

}
