package theSocialNetwork;

public class photo extends MessageFacts{
	
	private String dataName;
	private String headline;
	
	public photo(String authorUsername, String dataName, String headline) {
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
