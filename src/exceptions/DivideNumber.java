package exceptions;

public class DivideNumber {
	
	public static void devideNumbers(int zähler, int nänner) {
		try {
			int x,y;
			x = zähler;
			y = nänner;
			System.out.println(x/y);
		} catch (final ArithmeticException e) {
			System.out.println("Division durch null nicht möglich");
		}
	}

	public static void main(String[] args) {
		
		devideNumbers(10,2);

	}

}
