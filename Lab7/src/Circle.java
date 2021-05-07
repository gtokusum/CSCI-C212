import java.awt.Color;

public class Circle extends Oval{
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(Color fillColor, Color borderColor, int x, int y, int radius) {
		super(fillColor, borderColor, x, y,radius, radius);
		// TODO Auto-generated constructor stub
	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(Color fillColor, int x, int y, int radius) {
		super(fillColor, x, y, radius, radius);
		// TODO Auto-generated constructor stub
	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(int x, int y, int radius) {
		super(x, y, radius, radius);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return area of shape
	 */
	@Override
	public double getArea() {
		return Math.PI * Math.pow(super.getWidth(),2);
	}
	
	/**
	 * @return perimeter of shape
	 */
	@Override
	public double getPerimeter() {
		return 2*Math.PI*super.getWidth();
	}
	
	/**
	 * @return String description of shape
	 */
	@Override
	public String toString() {
		return "Circle at " + super.getLocation() + " with radius " + super.getWidth();
	}
	
	/**
	 * @return boolean if obj has the same area and perimeter
	 */
	@Override
	public boolean equals(Shape obj) {
		return obj.getArea() == this.getArea() && this.getPerimeter() == obj.getPerimeter();
	}
	

}
