package geoMetry;

public class Rectangle extends Product {
	
	private double length;
	private double width;
	
	public Rectangle(double x, double y, double length, double width) {
		this.setY(y);
		this.setX(x);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateCircumference() {
		return (2*this.length + (2*this.width));
	}
 
	@Override
	public double calculateArea() {
		return this.length * this.width;
	}
 
	public String toString() {
		return "Rectangle:\n\t" + "Length: "  + this.length + "\n\tWidth: " + this.width;
	}
}

