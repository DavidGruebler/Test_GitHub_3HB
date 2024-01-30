package theSocialNetwork;



public class Messages extends MessageFacts {
	
	private String messageText;
	
	
	public Messages(String authorUsername, String messageText) {
		super(authorUsername);
		this.messageText = messageText;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
	

}
