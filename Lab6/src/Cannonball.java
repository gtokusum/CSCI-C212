import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import java.lang.Math;

public class Cannonball {

	private double xPos;
	private double yPos;
	private double xVel;
	private double yVel;
	private final double G = 9.81;
	
	/**
	 * Constructor
	 * @param xPosition
	 */
	public Cannonball(double xPosition) {
		this.xPos = xPosition;
		this.yPos = 0;
		this.xVel = 0;
		this.yVel = 0;
	}
	
	
	/**
	 * returns current x position
	 * @return doubel x position
	 */
	public double getxPos() {
		return this.xPos;
	}


	/**
	 * sets a new x position
	 * @param double xPos
	 */
	public void setxPos(double xPos) {
		this.xPos = xPos;
	}


	/**
	 * returns the current y position
	 * @return double y position
	 */
	public double getyPos() {
		return this.yPos;
	}


	/**
	 * sets new y position
	 * @param double yPos
	 */
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}


	/**
	 * returns the x velocity
	 * @return double xVel
	 */
	public double getxVel() {
		return this.xVel;
	}


	/**
	 * sets new x velocity
	 * @param double xVel
	 */
	public void setxVel(double xVel) {
		this.xVel = xVel;
	}


	/**
	 * returns current y velocity
	 * @return double yVel
	 */
	public double getyVel() {
		return this.yVel;
	}


	/**
	 * sets new y velocity
	 * @param double yVel
	 */
	public void setyVel(double yVel) {
		this.yVel = yVel;
	}

	
	/**
	 * calculates the next position of cannonball after deltaSec seconds and
	 * sets new x,y positions and new y velocity 
	 * @param double deltaSec
	 */
	public void move(double deltaSec) {
		double tmpXpos = this.getxPos() + (this.getxVel() * deltaSec);
		double tmpYpos = this.getyPos() + (this.getyVel() * deltaSec) - ((G*Math.pow(deltaSec, 2)/2));
		this.setxPos(tmpXpos);
		this.setyPos(tmpYpos);
		double tmpYvel = this.getyVel() - (G*deltaSec);
		this.setyVel(tmpYvel);
	}
	
	
	/**
	 * gets current location of object and creates a point at the position
	 * @return Point ballLoc
	 */
	public Point getLocation() {
		Point ballLoc = new Point((int)this.getxPos(),(int)this.getyPos());
		return ballLoc;
	}
	
	
	/**
	 * simulates a projectile motion of Cannonball object and stores points
	 * at every deltaSec in to arrayList<Point> points
	 * @param double alpha
	 * @param double v
	 * @param double deltaSec
	 * @return ArrayList<Point> points
	 */
	public ArrayList<Point> shoot(double alpha,double v, double deltaSec){
		ArrayList<Point> points = new ArrayList<Point>();
		this.setxVel(v*Math.cos(alpha));
		this.setyVel(v*Math.sin(alpha));
		points.add(this.getLocation());
		this.move(deltaSec);
		points.add(this.getLocation());
		while (this.getyPos() >= 0) {
			this.move(deltaSec);
			points.add(this.getLocation());
		}
		return points;
	}
	
	/**
	 * driver for Cannonball
	 * takes input from user for starting position, angle of trajectory, initial velocity of ball
	 * and delta Seconds
	 * Then creates a new instance of cannonball and calls shoot using user input at args
	 * Then creates a frame and draws the trajectory onto it
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting x position\nEnter starting angle\nEnter initial velocity\nEnter time interval");
		double startXPos = sc.nextDouble();
		double alpha = sc.nextDouble();
		double initialVel = sc.nextDouble();
		double deltaS = sc.nextDouble();
		
		
		Cannonball test = new Cannonball(startXPos);
		ArrayList<Point> toPrint = test.shoot(Math.toRadians(alpha),initialVel,deltaS);
		JFrame frame = new JFrame();
		frame.setSize(1200,1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShapeComponent component = new ShapeComponent(toPrint);
		frame.add(component);
		frame.setVisible(true);
		sc.close();
	}

}
