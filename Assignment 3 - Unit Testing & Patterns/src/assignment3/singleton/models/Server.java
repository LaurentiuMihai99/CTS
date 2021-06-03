package assignment3.singleton.models;

public class Server implements ServerInterface {

	private String ipAddress;
	private int port;
	private int maxConnections;
	private boolean connected;
	
	private static Server server = null;
	
	private Server(String ipAddress, int port, int maxConnections) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
		this.connected = false;
	}
	
	private Server() {}
	
	public static synchronized Server getServer() {
		if (server == null) {
			String ipAddress = "192.168.0.1";
			int port = 8080;
			int maxConnections = 10;
			server = new Server(ipAddress, port, maxConnections);
		}
		return server;
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

}
