import java.awt.*;

public abstract class Shape {
	
	private Color fillColor;
	private Color borderColor;
	private Boolean isFilled;
	private Point location;
	
	/**
	 * constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 */
	public Shape(Color fillColor, Color borderColor, int x, int y) {
		this.fillColor = fillColor;
		this.borderColor = borderColor;
		this.location = new Point(x,y);
	}
	
	/**
	 * constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 */
	public Shape(Color fillColor, int x, int y) {
		this.fillColor = fillColor;
		this.borderColor = Color.black;
		this.location = new Point(x,y);
	}
	
	/**
	 * constructor
	 * @param x
	 * @param y
	 */
	public Shape(int x, int y) {
		this.fillColor = Color.white;
		this.borderColor = Color.black;
		this.location = new Point(x,y);
	}
	
	/**
	 * gets fillColor
	 * @return Color fillColor
	 */
	public Color getFillColor() {
		return fillColor;
	}

	/**
	 * sets the fillColor
	 * @param fillColor
	 */
	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * gets the borderColor
	 * @return borderColor
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * sets the borderColor
	 * @param borderColor
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * checks if shape is colored
	 * @return boolean
	 */
	public Boolean getIsFilled() {
		return isFilled;
	}

	/**
	 * sets ifFilled
	 * @param isFilled
	 */
	public void setIsFilled(Boolean isFilled) {
		this.isFilled = isFilled;
	}

	/**
	 * gets location of shape
	 * @return Point Location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * sets location
	 * @param Point location
	 */
	public void setLocation(Point location) {
		this.location = location;
	}
	
	/**
	 * gets x coor
	 * @return int X
	 */
	public int getX() {
		return (int)this.location.getX();
	}
	
	/**
	 * gets y coor
	 * @return int Y
	 */
	public int getY() {
		return (int)this.location.getY();
	}
	
	/**
	 * sets the x coor
	 * @param int x
	 */
	public void setX(int x) {
		this.location = new Point(x,(int)this.getY());
	}
	
	/**
	 * sets y coor
	 * @param int y
	 */
	public void setY(int y) {
		this.location = new Point((int)this.getX(),y);
	}

	/**
	 * draw method
	 * @param g
	 */
	abstract void draw(Graphics g);
	
	/**
	 * area method
	 * @return area
	 */
	abstract double getArea();
	
	/**
	 * perimeter method
	 * @return perimeter
	 */
	abstract double getPerimeter();

	
}
