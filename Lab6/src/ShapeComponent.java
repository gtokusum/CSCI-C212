import java.awt.*;
import java.util.ArrayList;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JComponent;

public class ShapeComponent extends JComponent{
	
	private ArrayList<Point> points;
	
	/**
	 * Constructor to send an arraylist from Cannonball driver
	 * @param ArrayList<Point> toPrint
	 */
	public ShapeComponent(ArrayList<Point> toPrint) {
		this.points = toPrint;
	}

	/**
	 * draws a circle for every point in the ArrayList<Point> points
	 */
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.black);
		for (int i = 0; i < this.points.size(); i++) {
			Ellipse2D.Double toDraw = new Ellipse2D.Double(this.points.get(i).getX(), 1200 - this.points.get(i).getY(),
			5,5);
			g2.fill(toDraw);
			g2.draw(toDraw);
		}
	}
}
