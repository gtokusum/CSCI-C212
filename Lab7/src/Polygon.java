import java.awt.Color;
import java.awt.Graphics;

public class Polygon extends Shape{
	
	private int length;
	private int nSide;
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param length
	 * @param nSide
	 */
	public Polygon(Color fillColor, Color borderColor, int x, int y,int length, int nSide) {
		super(fillColor, borderColor, x, y);
		this.length = length;
		this.nSide = nSide;
	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param length
	 * @param nSide
	 */
	public Polygon(Color fillColor, int x, int y,int length, int nSide) {
		super(fillColor, x, y);
		this.length = length;
		this.nSide = nSide;
	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param length
	 * @param nSide
	 */
	public Polygon(int x, int y, int length, int nSide) {
		super(x, y);
		this.length = length;
		this.nSide = nSide;
	}
	
	/**
	 * sets length of polygon
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * gets the length of polygon
	 * @return length
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * sets the number of sides
	 * @param n 
	 */
	public void setNSide(int n) {
		this.nSide = n;
	}
	
	/**
	 * gets the number of sides
	 * @return nSide
	 */
	public int getSide() {
		return this.nSide;
	}

	/**
	 * draw method
	 */
	@Override
	void draw(Graphics g) {
		double theta = 2*Math.PI/nSide;
		int[] xCoor = new int[nSide];
		int[] yCoor = new int[nSide];
		for (int i = 0; i < nSide; i++) {
			xCoor[i] = (int)Math.cos(theta*i) * 20;
			yCoor[i] = (int)Math.sin(theta*i) * 20;
		}
		g.drawPolygon(xCoor,yCoor,nSide);
		
	}

	/**
	 * @return area of polygon
	 */
	@Override
	double getArea() {
		return Math.pow(length, 2) * (nSide/4) * Math.tan(180/nSide);
	}

	/**
	 * @return perimeter of polygon
	 */
	@Override
	double getPerimeter() {
		return length * nSide;
	}
	
	/**
	 * @return String description of polygon
	 */
	public String toString() {
		return "Polygon with " + nSide + " at " + super.getLocation() + " with size " + this.getArea();
	}

	

}
