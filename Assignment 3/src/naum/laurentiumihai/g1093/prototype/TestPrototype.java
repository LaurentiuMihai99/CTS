package naum.laurentiumihai.g1093.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		ListingModel listing = new ListingModel("Apt 2 camere", "http://www.imobiliare.ro/apt2cam");
		ListingModel listing2 = (ListingModel) listing.clone();
		ListingModel listing3 = (ListingModel) listing.clone();
	}

}
