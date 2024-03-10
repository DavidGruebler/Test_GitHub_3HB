package musicalChairs;

public class MusicalChairsGame {

	public static void main(String[] args) {
		MusicalChair mc1 = new MusicalChair("Lisa", "Susi", "Tom", "Lucas");
		System.out.println(mc1);
		
		MusicalChair mc2 = new MusicalChair("Medelein", "Benedikt");
		System.out.println(mc2);
		
		//MusicalChair mc3 = new MusicalChair();
		//System.out.println(mc3);
		mc1.rotate(2);
		System.out.println(mc1);
		
		mc1.rotateAndRemove(2);
		System.out.println(mc1);;
	}

}
