package rekursion;

public class Faculty {
	
	public static int calcluateFaculty(int n) {
		if(n == 0) {
			return 1;
		} else {
			
			return n * calcluateFaculty (n-1);
		}
	}

	public static void main(String[] args) {

		System.out.println(calcluateFaculty(5));
		
	}

}
