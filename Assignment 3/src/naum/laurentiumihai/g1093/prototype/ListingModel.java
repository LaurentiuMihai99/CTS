package naum.laurentiumihai.g1093.prototype;

public class ListingModel {
	String name;
	String URL;
	
	private ListingModel() {}
	public ListingModel(String name, String URL) {
		this.name = name;
		this.URL = URL;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		ListingModel listingCopy = new ListingModel();
		listingCopy.name = this.name;
		listingCopy.URL = this.URL;
		System.out.println("Cloned Listing!");
		return listingCopy;
	}
}
