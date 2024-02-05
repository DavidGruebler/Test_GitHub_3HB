package theSocialNetwork;


import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private ArrayList<MessageFacts> entries;

    /**
     * Creates a new news feed; The news feed is initially empty
     */
    public NewsFeed() {
        entries = new ArrayList<>();
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
    public List<MessageFacts> getEntries() {
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
    public List<MessageFacts> findEntriesByAuthor(String author) {
        List<MessageFacts> results = new ArrayList<>();
        for (MessageFacts entry : entries) {
            if (entry.getAuthorUsername().equals(author)) {
                results.add(entry);
            }
            System.out.println(this.findEntriesByAuthor(author));
        }
        return results;
    }

    /**
     * method to find photos
     * @param author
     * @return the result
     */
    public List<MessageFacts> findPhotosByAuthor(String author) {
        List<MessageFacts> results = new ArrayList<>();
        for (MessageFacts entry : entries) {
            if (entry instanceof Photo && entry.getAuthorUsername().equals(author)) {
                results.add(entry);
            }
        }
        return results;
    }
}
