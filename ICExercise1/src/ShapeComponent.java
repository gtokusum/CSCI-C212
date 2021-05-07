//  ICExercise1
//  
//  Released:  2/1/2021
//
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited:  2/2/2021
//
//
//  Directions:  Two side by side rectangles where one rectangle is inside a circle. 
//	Both rectangles and the circle are inside an ellipse. Edges should not be 	
//	touching each other
//               
//               
//////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class ShapeComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
//		recover graphics
		Graphics2D g2 = (Graphics2D) g;
		
//		create ellipse, fill with blue and draw
		Ellipse2D.Double ellipse = new Ellipse2D.Double(25,100,450,200);
		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
		g2.draw(ellipse);
		
//		create circle, fill with black and draw
		Ellipse2D.Double circle = new Ellipse2D.Double(275,150,100,100);
		g2.setColor(Color.black);
		g2.fill(circle);
		g2.draw(circle);
		
//		create a rectangle, fill with red and draw
		Rectangle box = new Rectangle(125,175,50,50);
		g2.setColor(Color.red);
		g2.fill(box);
		g2.draw(box);
//		translate the box over to the right, then fill with green and draw
		box.translate(175, 0);
		g2.setColor(Color.GREEN);
		g2.fill(box);
		g2.draw(box);
	}
}
