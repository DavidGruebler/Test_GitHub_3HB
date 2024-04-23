package rekursion;

public class Sum {
	
	public static int calcluateSum(int n) {
		if(n == 0) {
			return 0;
		} else {
			
			return n + calcluateSum (n-1);
		}
	}

	public static void main(String[] args) {

		System.out.println(calcluateSum(100));
		
	}

}