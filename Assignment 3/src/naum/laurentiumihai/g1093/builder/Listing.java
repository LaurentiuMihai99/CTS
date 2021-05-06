package naum.laurentiumihai.g1093.builder;

public class Listing {
	String URL;
	boolean hasHeatingSystem;
	boolean hasAC;
	boolean hasBalcony;
	
	private Listing(){}
	public Listing(String URL, boolean hasHeatingSystem, boolean hasAC, boolean hasBalcony) {
		this.URL = URL;
		this.hasHeatingSystem = hasHeatingSystem;
		this.hasAC = hasAC;
		this.hasBalcony = hasBalcony;
	}
	
	public static class ListingBuilder {
		Listing listing;
		
		public ListingBuilder(String URL) {
			this.listing = new Listing();
			this.listing.URL = URL;
		}
		
		public ListingBuilder hasHeatingSystem() {
			this.listing.hasHeatingSystem = true;
			System.out.println("Listing " + this.listing.URL + " has a heating system");
			return this;
		}
		
		public ListingBuilder hasAC() {
			this.listing.hasAC = true;
			System.out.println("Listing " + this.listing.URL + " has AC");
			return this;
		}
		
		public ListingBuilder hasBalcony() {
			this.listing.hasBalcony = true;
			System.out.println("Listing " + this.listing.URL + " has a balcony");
			return this;
		}
		
		public Listing build() {
			return this.listing;
		}
	}
}
