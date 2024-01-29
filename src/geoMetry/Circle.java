package geoMetry;

public class Circle extends Product {
	
	private double radius;

	public Circle(double y, double x, double radius) {
		super(y, x);
		this.radius = radius;
	}
	
	
	
	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	/**
	 * calculates area of Circle by using Math.Pi
	 */
	public double calculateArea() {
		return Math.PI * radius * radius;
		
	}

	@Override
	/**
	 * calculates circumference of Circle by using Math.PI
	 */
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	

}