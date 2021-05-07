import java.awt.Color;
import java.awt.Graphics;

public class Quadrilateral extends Shape{

	private int length;
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Quadrilateral(Color fillColor, Color borderColor, int x, int y, int length) {
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
	public Quadrilateral(Color fillColor,int x, int y, int length) {
		super(fillColor,x,y);
		this.length = length;
	}
	
	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Quadrilateral(int x, int y,int length) {
		super(x,y);
		this.length = length;
	}
	
	/**
	 * gets the length of side
	 * @return int length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * sets the length of side
	 * @param int length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * returns if area and perimeter are the same
	 * @param obj
	 * @return
	 */
	public boolean equals(Shape obj) {
		return obj.getArea() == this.getArea() && obj.getPerimeter() == this.getPerimeter();
	}
	
	/**
	 * @return String description of shape
	 */
	public String toString() {
		return "Quadrilateral at "+ super.getLocation() + " with size " + this.getArea();
	}

	/**
	 * draw method
	 */
	@Override
	void draw(Graphics g) {
		int[] xCoor = new int[4];
		int[] yCoor = new int[4];
		double theta = 2*Math.PI /4;
		for (int i = 0; i < 4;i++) {
			xCoor[i] = (int) Math.cos(theta*i) * 20;
			yCoor[i] = (int) Math.sin(theta*i) * 20;
		}
		g.drawPolygon(xCoor, yCoor, 4);
	}


	/**
	 * @return gets the area of shape
	 */
	@Override
	double getArea() {
		return this.length * Math.tan(180/4);
	}


	/**
	 * @return perimeter of shape
	 */
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return length * 4;
	}
}
