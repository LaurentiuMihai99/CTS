package naum.laurentiumihai.g1093.factory;

public class ListingFactory {
	private static final int MAX_ROOMS = 2;
	private static final int MIN_ROOMS = 1;
	
	public static AbstractListing getListing(int nrRooms, String URL) {
		AbstractListing listing = null;
		if (nrRooms > MAX_ROOMS || nrRooms < MIN_ROOMS) {
			throw new UnsupportedOperationException();
		}
		if (nrRooms == 1) {
			listing = new SingleRoomApt("DEFAULT", URL, "DEFAULT");
		}
		if (nrRooms == 2) {
			listing = new TwoRoomsApt("DEFAULT", URL, "DEFAULT");
		}
		
		return listing;
	}
}
