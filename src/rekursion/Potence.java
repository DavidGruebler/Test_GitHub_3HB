package rekursion;

public class Potence {
	
	public static int calcluatePotenz(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		} else {
			
			return base * calcluatePotenz (base,exponent-1);
		}
	}

	public static void main(String[] args) {

		System.out.println(calcluatePotenz(3,3));
		
	}

}