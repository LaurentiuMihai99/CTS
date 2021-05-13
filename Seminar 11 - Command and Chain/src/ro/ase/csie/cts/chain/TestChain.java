package ro.ase.csie.cts.chain;

public class TestChain {

	public static void main(String[] args) {
		GenericMessageHandler filterModule = new FilterModule("English");
		GenericMessageHandler privateModule = new PrivateMessageModule();
		GenericMessageHandler groupModule = new GroupMessageModule();
		
		filterModule.setNext(privateModule);
		privateModule.setNext(groupModule);
		
		GenericMessageHandler chatServer = filterModule;
		
		chatServer.processMessage(new Message("i hate you", "@John", 1));
		chatServer.processMessage(new Message("Hello there", "@John", 1));
		chatServer.processMessage(new Message("Come to the party", "@everyone", 1));
	}
}
