import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape{
	
	private int height;
	private int width;
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param height
	 * @param width
	 */
	public Oval(Color fillColor, Color borderColor, int x, int y,int height,int width) {
		super(fillColor, borderColor, x, y);
		this.height = height;
		this.width = width;
	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param height
	 * @param width
	 */
	public Oval(Color fillColor, int x, int y, int height, int width) {
		super(fillColor, x, y);
		this.height = height;
		this.width = width;
	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param height
	 * @param width
	 */
	public Oval(int x, int y, int height, int width) {
		super(x,y);
		this.height = height;
		this.width = width;
	}
	
	
	/**
	 * gets the height of oval
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * sets the height of oval
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * gets the width of oval
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * sets the width of oval
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	
	/**
	 * checks if obj area and perimeter equals this.area and this.perimeter
	 * @param obj
	 * @return
	 */
	public boolean equals(Shape obj) {
		return obj.getArea() == this.getArea() && obj.getPerimeter() == this.getPerimeter();
	}
	
	/**
	 * @return String description of oval
	 */
	@Override
	public String toString() {
		return "Oval at " + super.getLocation() + " with size " + this.getArea();
	}
	
	/**
	 * @return perimeter of shape
	 */
	@Override
	public double getPerimeter() {
		return (Math.PI * 2) * Math.sqrt(( Math.pow(height, 2) + Math.pow(width, 2) / 2 ));
	}
	
	/**
	 * @return area of shape
	 */
	@Override
	public double getArea() {
		return Math.PI * width * height;
	}

	/**
	 * draw method
	 */
	@Override
	void draw(Graphics g) {
		g.drawOval(super.getX(),super.getY(), width,height);
	}

}
