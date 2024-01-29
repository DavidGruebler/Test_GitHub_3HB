package geoMetry;

public class Triangle extends Product {
	
	
	private double site1;
    private double site2;
    private double site3;
    private double height;
    private double base;

    public Triangle(double y, double x, double site1, double site2, double site3, double height, double base) {
		super(y, x);
		this.site1 = site1;
        this.site2 = site2;
        this.site3 = site3;
        this.height = height;
        this.base = calculateBase();
	}
    
    
    /**
     * calculates base of each triangle
     * @return
     */
    private double calculateBase() {
        return 2 * Math.sqrt(site1*site1 - 0.25*height*height);
    }

	@Override
	/**
	 * calculates circumference of triangle
	 */
	public double calculateCircumference() {
		 return site1 + site2 + site3;
	}

	@Override
	/**
	 * calculates area of triangle by using the base which was already calculated
	 */
	public double calculateArea() {
		return 0.5 * base * height;
	}
 
    
}