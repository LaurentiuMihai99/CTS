package assignment3.prototype.models;

public class Server implements ServerInterface {

	private String ipAddress;
	private int port;
	private int maxConnections;
	private boolean connected;
	
	public Server(String ipAddress, int port, int maxConnections) throws InterruptedException {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
		this.connected = false;
		Thread.sleep(3000);
	}
	
	private Server() {}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Server copy = new Server();
		copy.ipAddress = this.ipAddress;
		copy.port = this.port;
		copy.maxConnections = this.maxConnections;
		copy.connected = this.connected;
		return copy;
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
