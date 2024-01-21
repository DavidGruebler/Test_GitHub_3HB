package geoMetry;

public class Circle extends Product {
	
	private double radius;

	public final double pi = 3.14;
	
	public Circle(double x, double y, double radius) {
		this.setX(x);
		this.setY(y);
		this.radius = radius;
	}

	@Override
	public double calculateCircumference() {
		return 2 * this.pi * this.radius;
	}
 
	@Override
	public double calculateArea() {
		return this.pi * this.radius * this.radius;
	}
	public String toString() {
		return "Circle:\n\t" + "Radius: " + this.radius;
	}
}