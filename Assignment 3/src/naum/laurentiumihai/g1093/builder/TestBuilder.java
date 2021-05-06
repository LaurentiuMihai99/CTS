package naum.laurentiumihai.g1093.builder;

public class TestBuilder {
	public static void main(String[] args) {
		Listing listing = new Listing.ListingBuilder("http://apt2cam").build();
		Listing listing2 = new Listing.ListingBuilder("http://apt3cam").hasAC().hasBalcony().build();
	}
}
