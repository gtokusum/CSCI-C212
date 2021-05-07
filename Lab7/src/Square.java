import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rhombus{
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Square(Color fillColor, Color borderColor, int x, int y, int length) {
		super(fillColor, borderColor, x, y, length);

	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Square(Color fillColor, int x, int y, int length) {
		super(fillColor, x, y, length);

	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Square(int x, int y,int length) {
		super(x,y,length);
	}
	
	/**
	 * draw method
	 */
	@Override
	public void draw(Graphics g) {
		g.drawRect(super.getX(), super.getY(), super.getLength(), super.getLength());
	}
	
	/**
	 * @return String description of shape
	 */
	@Override
	public String toString() {
		return "Square at " + super.getLocation() + " with size " + this.getArea();
	}
	
	/**
	 * @return if obj has the same area and perimeter
	 */
	@Override
	public boolean equals(Shape obj) {
		return this.getArea() == obj.getArea() && this.getPerimeter() == obj.getPerimeter();
	}
	
	/**
	 * @return area of shape
	 */
	@Override
	public double getArea() {
		return Math.pow(super.getLength(), 2);
	}
	
	/**
	 * @return perimeter of shape
	 */
	@Override
	public double getPerimeter() {
		return super.getLength() * 4;
	}
}
