package naum.laurentiumihai.g1093.factory;

public abstract class AbstractListing {
	
		String name;
		String URL;
		String specs;

		public AbstractListing(String name, String URL, String specs) {
			this.name = name;
			this.URL = URL;
			this.specs = specs;
		}

		public abstract void displayRooms();
	
}
