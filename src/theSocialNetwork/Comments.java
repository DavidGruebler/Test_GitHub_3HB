package theSocialNetwork;

public class Comments {
	
	private String userName;
	private String message;

	public Comments(String userName, String message) {
		super();
		this.userName = userName;
		this.message = message;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
