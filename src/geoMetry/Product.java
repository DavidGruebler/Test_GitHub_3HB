package geoMetry;

public abstract class Product {
	
	private double y;
	private double x;
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	@Override
	public String toString() {
		return "Product [y=" + y + ", x=" + x + "]";
	}
	
	public abstract double calculateCircumference();
	public abstract double calculateArea();

}
