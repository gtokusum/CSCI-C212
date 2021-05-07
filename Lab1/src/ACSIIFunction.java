//Gaku Tokusumi
//gtokusum
//Created Jan-19-2021
//Lab1


public class ACSIIFunction {
	
	//method for creating a triangle
	public String getTriangle() {
		String outputTriangle = "";
		
		//used to calculate width of each row
		int rows = 1;
		int width = 5;
		
		//created the triangle
		while (rows <= 6) {
			
			//calculates the necessary spacing needed
			double space = (width/2);
			String spacingString = " ";
			String stars = "*";
			
			//concatenate the spaces and stars to outputTriangle
			outputTriangle = outputTriangle.concat(spacingString.repeat((int)space));
			outputTriangle = outputTriangle.concat(stars.repeat(rows))+"\n";
			width -= 2;
			rows += 2;
		}
	return outputTriangle;
	}
	
	//method for creating right triangles
	public String getRightTriangle() {
		String outputRight = "";
		
		//keeps count of how many stars get concatenated for every iteration
		int counter = 1;
		String star = "*";
		
		//creates the right triangle
		while(counter <= 5) {
			outputRight = outputRight.concat(star.repeat(counter))+ "\n";
			counter+=1;
		
		}
	return outputRight;
	}
	public static void main(String[] args) {
		
		//creates and instance of the class
		ACSIIFunction triangles = new ACSIIFunction();
		
		//use the .getTriangles method to print triangle
		System.out.println(triangles.getTriangle());
		
//		//use the .getRightTriangle method to print right triangle
//		System.out.println(triangles.getRightTriangle());
//		
//		//use StringBuilder class to transform the right triangle over the x axis
//		StringBuilder rightTriangle = new StringBuilder(triangles.getRightTriangle());
//		System.out.println(rightTriangle.reverse());
	}

}

/*
TODO: What Fields does the System class have?
  The System class has static: PrintStream, InputStream, and PrintStream

TODO List Two other methods from PrintStream class (apart from print and println)
  close() and write()
  */

