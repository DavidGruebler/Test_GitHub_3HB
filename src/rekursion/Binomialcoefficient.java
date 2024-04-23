package rekursion;

public class Binomialcoefficient {
	
	public static int calcluateBino(int n,int k) {
		if(k == 0 || k == n) {
			return 1;
		} else {
			
			return calcluateBino((n-1),(k-1)) + calcluateBino((n-1),(k));
		}
	}

	public static void main(String[] args) {

		System.out.println(calcluateBino(11  ,7));
		
	}

}