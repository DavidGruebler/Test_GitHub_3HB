package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Messages extends MessageFacts {
	
	private String messageText;
	
	
	public Messages(String authorUsername, LocalDate timestamp, ArrayList<String> comments, int likes,String messageText) {
		super(authorUsername, timestamp, comments, likes);
		this.messageText = messageText;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
	

}
