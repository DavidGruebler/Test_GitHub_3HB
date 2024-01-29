package geoMetry;

public class Rectangle extends Product{
	
	private double length;
	private double width;
	
	
	
	public Rectangle(double x, double y, double length, double width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	@Override
	/**
	 * calculates area of Rectangle
	 */
	public double calculateCircumference() {
		return (2*this.length) + (2*this.width);
	}
	
	
	/**
	 * calculates area of Rectangle
	 */
	@Override
	public double calculateArea() {
		return this.length *this.width;
	}

}