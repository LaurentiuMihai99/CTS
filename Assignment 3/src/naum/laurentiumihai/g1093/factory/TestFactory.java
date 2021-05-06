package naum.laurentiumihai.g1093.factory;

public class TestFactory {

	public static void main(String[] args) {
		AbstractListing garsoniera = ListingFactory.getListing(1, "http://www.imobiliare.ro/garsoniera");
		AbstractListing apartment = ListingFactory.getListing(2, "http://www.imobiliare.ro/apt2cam");
		
		garsoniera.displayRooms();
		apartment.displayRooms();
	}

}
