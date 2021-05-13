package ro.ase.csie.cts.chain;

public class FilterModule extends GenericMessageHandler {
	String language;
	String[] forbiddenWords = new String[] {"kill", "hate", "violent"};
	
	public FilterModule(String language) {
		super();
		this.language = language;
	}

	@Override
	public void processMessage(Message message) {
		boolean isOk = true;
		for(String word : forbiddenWords) {
			if(message.text.toLowerCase().contains(word.toLowerCase())) {
				isOk = false;
				break;
			}
		}
		
		if (isOk) {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
		else System.out.println("Filtered out");
	}
}
