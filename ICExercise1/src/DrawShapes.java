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


import javax.swing.JFrame;

/*Two side by side rectangles where one rectangle is inside a circle. Both rectangles
 * and the circle are inside an ellipse. Edges should not be touching each other
*/
public class DrawShapes {

	public static void main(String[] args) {
		
//		create frame
		JFrame frame = new JFrame();
		
//		set frame size and add closing operations
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		create obj of ShapeComponent
		ShapeComponent component = new ShapeComponent();
		
//		Draw the shapes on to frame and make it visible
		frame.add(component);
		frame.setVisible(true);
	}

}
