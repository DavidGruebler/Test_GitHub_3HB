package theSocialNetwork;


import java.util.ArrayList;

public class NewsFeed {

    private ArrayList<MessageFacts> entries;

    public NewsFeed() {
        this.entries = new ArrayList<MessageFacts>();
    }
        
    @Override
	public String toString() {
		return "NewsFeed [entries=" + entries + "]";
	}

	/**
     * method to create new entries 
     * @param the entry to be added
     */
    public void addEntry(MessageFacts entry) {
        entries.add(entry);
    }

    /**
     * method to remove an entry
     * @param index
     */
    public void removeEntry(int index) {
        entries.remove(index);
    }

    /**
     * Returns the collection of entries
     * @return the collection of entries
     */
    public ArrayList<MessageFacts> getEntries() {
        return entries;
    }
    
    /** 
     * Outputs all entries in a collection of entries
     */
    public void printEntries() {
        for (MessageFacts entry : entries) {
            System.out.println(entry);
        }
    }
    
    /**
     * method to find the entries
     * @param author
     * @return the result
     */
    public void findEntriesByAuthor(String author) {
    	for(MessageFacts s : this.entries) {
    		if(s.getAuthorUsername().equals(author)) {
    			System.out.println(s);
    		}
    	}
        
    }
}
