package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class MassageFacts {
	   private String authorUsername;
	   private LocalDate timestamp;
	   private ArrayList<String> comments;
	   private int likes;
	   
	  
	public MassageFacts(String authorUsername, LocalDate timestamp, ArrayList<String> comments, int likes) {
		this.authorUsername = authorUsername;
		this.timestamp = timestamp;
		this.comments = comments;
		this.likes = likes;
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
	
	public ArrayList<String> getComments() {
		return comments;
	}
	
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	   
	   

}
