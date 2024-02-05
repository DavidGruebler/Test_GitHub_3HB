package theSocialNetwork;

public class Photo extends MessageFacts{
	
	private String dataName;
	private String headline;
	
	public Photo(String authorUsername, String dataName, String headline) {
		super(authorUsername);
		this.dataName = dataName;
		this.headline = headline;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	

	
	
	
}
