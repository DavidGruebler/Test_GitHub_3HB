package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MessageFacts {
	   private String authorUsername;
	   private LocalDate timestamp;
	   private ArrayList<Comments> comments;
	   private int likes;
	   
	public MessageFacts(String authorUsername) {
		this.authorUsername = authorUsername;
		this.timestamp = LocalDate.now();
		this.likes = 0;
		this.comments = new ArrayList<>();
	}
	
	public String getAuthorUsername() {
		return authorUsername;
	}
	
	public void setAuthorUsername(String authorUsername) {
		this.authorUsername = authorUsername;
	}
	
	public LocalDate getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	
	public ArrayList<Comments> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comments> comments) {
		this.comments = comments;
	}

	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
}
