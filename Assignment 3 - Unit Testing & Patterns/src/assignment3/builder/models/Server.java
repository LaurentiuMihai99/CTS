package assignment3.builder.models;

public class Server implements ServerInterface {

	public String name;
	private String ipAddress;
	private int port;
	private int maxConnections;
	private boolean connected;
	public String country;
	public boolean fiveG;
	
	public Server(String ipAddress, int port, int maxConnections) throws InterruptedException {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
		this.connected = false;
	}
	
	public Server() {
		this.name = "";
		this.ipAddress = "";
		this.port = 8080;
		this.maxConnections = 10;
		this.connected = false;
		this.country = "RO";
		this.fiveG = false;
	}

	@Override
	public String getIpAddress() {
		return this.ipAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		return this.maxConnections;
	}

	@Override
	public boolean connect() {
		this.connected = true;
		System.out.println("Connected");
		return true;
	}

	@Override
	public boolean disconnect() {
		this.connected = false;
		System.out.println("Disconnected");
		return true;
	}
	
	public boolean isConnected() {
		return this.connected;
	}
	
	public static class ServerBuilder {
		Server server;
		
		public ServerBuilder(String name, String ipAddress) {
			this.server = new Server();
			this.server.name = name;
			this.server.ipAddress = ipAddress;
		}

		public ServerBuilder isConnected() {
			this.server.connected = true;
			return this;
		}
		
		public ServerBuilder isDisonnected() {
			this.server.connected = false;
			return this;
		}
		
		public ServerBuilder isFiveG() {
			this.server.fiveG = true;
			return this;
		}
		
		public ServerBuilder setPort(int port) {
			this.server.port = port;
			return this;
		}
		
		public ServerBuilder setMaxConnections(int maxConnections) {
			this.server.maxConnections = maxConnections;
			return this;
		}
		
		public ServerBuilder setCoountry(String country) {
			this.server.country = country;
			return this;
		}
		
		public Server build() {
			return this.server;
		}
	}
}

