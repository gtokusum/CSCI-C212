import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape{
	
	private int length;
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Triangle(Color fillColor, Color borderColor, int x, int y, int length) {
		super(fillColor, borderColor, x, y);
		this.length = length;
	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Triangle(Color fillColor, int x, int y, int length) {
		super(fillColor, x, y);
		this.length = length;
	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Triangle(int x, int y, int length) {
		super(x, y);
		this.length = length;
	}
	
	/**
	 * gets length of triangle
	 * @return int length
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * sets length of triangle
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * draw method
	 */
	@Override
	void draw(Graphics g) {
		int[] xCoor = new int[3];
		int[] yCoor = new int[3];
		xCoor[0] = super.getX();
		yCoor[0] = super.getY();
		xCoor[1] = super.getX() + length/2;
		yCoor[1] = super.getY() + length;
		xCoor[2] = super.getX() + length;
		yCoor[3] = super.getY() + length/2;
		
		g.drawPolyline(xCoor, yCoor, 3);
		
	}

	/**
	 * @return area of triangle
	 */
	@Override
	double getArea() {
		return (Math.sqrt(3)/4) * length;
	}

	/**
	 * @return perimeter of triagnle
	 */
	@Override
	double getPerimeter() {
		return length*3;
	}
	
	/**
	 * @return String description of shape
	 */
	public String toString() {
		return "Triangle at " +super.getLocation() + " with size " + this.getArea();
	}
	
	/**
	 * checks if obj has the same area and perimeter
	 * @param obj
	 * @return boolean
	 */
	public boolean equals(Triangle obj) {
		return obj.getArea() == this.getArea() && obj.getPerimeter() == this.getPerimeter();
	}
	

}
