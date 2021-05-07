package lab1changed;

public class CreatingShapes {
	
	public static void getTriangle() {
		String outputTriangle = "";
		
		//used to calculate width of each row
		int rows = 1;
		int width = 9;
		
		//created the triangle
		while (rows <= 10) {
			
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
		//prints out first triangle
		System.out.println(outputTriangle);
		
	}
	
	//method for creating right triangles
		public static void getRightTriangle() {
			String outputRight = "";
			
			//keeps count of how many stars get concatenated for every iteration
			int counter = 1;
			String star = "*";
			
			//creates the right triangle
			while(counter <= 5) {
				outputRight = outputRight.concat(star.repeat(counter))+ "\n";
				counter+=1;
			
			}
		//prints out the second triangle
		System.out.println(outputRight);
		
		//using StringBuilder to reverse outputRight and print
		StringBuilder rightTriangle = new StringBuilder(outputRight);
		System.out.println(rightTriangle.reverse()); 
		}
	
	public static void main(String[] args) {
		//call methods to create and print triangles
		getTriangle();
		getRightTriangle();
	}

}
