
public class MyRectangle {
	
	//constructor
	double rectLength;
	double rectBreadth;
	String fullLength;
	String fullBreadth;
	
	public MyRectangle(double length, double breadth){
		rectLength = length;
		rectBreadth = breadth;
		fullLength = "Length: "+length;
		fullBreadth = "Breadth: "+breadth;
	}
	
	//method to get length
	public double getLength() {
		return rectLength;
	}
	
	//method to get breadth
	public double getBreadth() {
		return rectBreadth;
	}
	
	//method to get string for output
	public String getAll() {
		return fullLength + " " + fullBreadth;
	}

}
