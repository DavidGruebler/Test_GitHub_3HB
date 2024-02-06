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

	@Override
	public String toString() {
		return "Message:" +
				"\n" + this.getAuthorUsername() + " posted: " + this.getMessageText() +
				"\n" + "Likes: " + this.getLikes() +
				"\n" + "Posttime: " + this.getTimestamp() +
				"\n" + "Comments: " +this.getComments()+ "\n" + "-----------------------";
	}
	
	
	
}
