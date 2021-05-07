import java.awt.Color;

public class Octagon extends Polygon{
	
	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param borderColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Octagon(Color fillColor, Color borderColor, int x, int y, int length) {
		super(fillColor, borderColor, x, y, length, 8);
		// TODO Auto-generated constructor stub
	}

	/**
	 * overloaded constructor
	 * @param fillColor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Octagon(Color fillColor, int x, int y, int length) {
		super(fillColor, x, y, length, 8);
		// TODO Auto-generated constructor stub
	}

	/**
	 * overloaded constructor
	 * @param x
	 * @param y
	 * @param length
	 */
	public Octagon(int x, int y, int length) {
		super(x, y, length, 8);
		// TODO Auto-generated constructor stub
	}
	
	

	

}
