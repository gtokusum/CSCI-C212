////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab6
//  @Author  
//  Explain: What does this class do?
///////////////////////////////////////////////////////////////////////////////////
 
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

/*
 * Driver program for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be finished in many ways.
 */
public class ShapeDriver extends JPanel {

    // Panel constants. Change this accordingly
    public final int FRAME_WIDTH = 1000;
    public final int FRAME_HEIGHT = 1000;

    private Random random;
	
	// Need some data structure here to store all Shapes to be drawn
	// via the paintComponent (an ArrayList<Shape> ???)
	
	// You can also keep other instance variables here as you deem fit
	
    public ShapeDriver() {
        super(); 

        /* TO-DO: 
         *  - set up this JPanel
         *  - initialize any other fields you've declared
         *  - You could also setBackground here
         */
    }

    @Override
    public void paintComponent(Graphics g) {
        // calling super class paintComponent method
        // background will not be colored otherwise
        super.paintComponent(g);

        /*
		  Invoke the .draw() of the different Shapes here. It should take
		  the Graphics g object as a parameter. Iterate over your data structure
		  holding all the various Shape objects and call their draw() method.
		*/
    }
    
	@Override
	public void actionPerformed(ActionEvent e){
		/*
		  This method gets invoked automatically whenever Timer runs out.
		  Purpose of this method should be to do all the randomization
		  such as picking random colors, sizes and also
		  deciding which type of shape to draw. 
		  
		  Don't make the size too large! Small to medium shapes is the aim
		  
		  Once you have a Shape object (can be a Triangle, Polygon, Square etc),
		  add this new object to your data structure that holds all shapes.
		  
		  Calling this.repaint() at the end, so that paintComponent() is invoked
		  and new Shape is picked up from the data structure and drawn.
		  
		  Remember, a specific type of shape (Square, Oval etc) can be repeated
		  only 10 times max.
		*/
		
		this.repaint();
		
	}
    // test client
    public static void main(String[] args) {
		// you could choose to leave this empty and let ShapeWindow do 
		// all the running.
    }
}