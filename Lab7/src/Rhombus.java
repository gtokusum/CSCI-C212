import java.awt.Color;
import java.awt.Graphics;

public class Rhombus extends Quadrilateral{
	
	private double diagonal;
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Rhombus(Color fillColor, Color borderColor, int x, int y, int length) {
		super(fillColor, borderColor, x, y, length);
		this.diagonal = Math.sqrt(2*length*length);
	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Rhombus(Color fillColor, int x, int y, int length) {
		super(fillColor, x, y, length);
		this.diagonal = Math.sqrt(2*length*length);
	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Rhombus(int x, int y,int length) {
		super(x,y,length);
		this.diagonal = Math.sqrt(2*length*length);
	}
	
	/**
	 * gets the diagonal 
	 * @return double diagonal
	 */
	public double getDiagonal() {
		return diagonal;
	}
	
	/**
	 * sets the diagonal
	 * @param diagonal
	 */
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	/**
	 * draw method
	 */
	@Override
	void draw(Graphics g) {
		int[] xCoor = new int[4];
		int[] yCoor = new int[4];
		xCoor[0] = (int) (super.getX() + diagonal/2);
		xCoor[1] = (int) (super.getX() + diagonal);
		xCoor[2] = (int) (super.getX() + diagonal/2);
		xCoor[3] = (int) (super.getX());
		yCoor[0] = (int) (super.getY());
		yCoor[1] = (int) (super.getY() + diagonal/2);
		yCoor[2] = (int) (super.getY() + diagonal);
		yCoor[3] = (int) (super.getY() + diagonal/2);
		g.drawPolygon(xCoor,yCoor,4);
	}
	
	/**
	 * @return String format of shape
	 */
	@Override
	public String toString() {
		return "Rhombus at " + super.getLocation() + " with size " + super.getArea();
	}
	
	/**
	 * @return if obj has the same area and perimeter 
	 */
	@Override
	public boolean equals(Shape obj) {
		return obj.getArea() == this.getArea() && obj.getPerimeter() == this.getPerimeter();
	}
	
	/**
	 * @return double area of shape
	 */
	@Override
	public double getArea() {
		return this.diagonal*this.diagonal /2;
	}
	
	/**
	 * @return perimeter of shape
	 */
	@Override
	public double getPerimeter() {
		return super.getLength()*4;
	}
}
