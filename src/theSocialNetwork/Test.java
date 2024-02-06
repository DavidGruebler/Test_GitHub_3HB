package theSocialNetwork;

public class Test {

	public static void main(String[] args) {
		
		Messages m1 = new Messages("Paul","Moin!!");
		Messages m2 = new Messages("Anna","Hallo!!");
		
		Photo p1 = new Photo("Paul", "Test1", "Hannes");
		Photo p2 = new Photo("Anna", "Test2", "David");
		
		NewsFeed n1 = new NewsFeed();
		
		n1.addEntry(m1);
		n1.addEntry(m2);
		n1.printEntries();
		
	}

}
