//  Lab 4
//
//  Released:  2/10/2021
//
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited: 2/12/2021
//
//
//
//////////////////////////////////////////////////////////////////////////////
public class ValidNumber {
	
	public static int sumOfSquares(int input) {
		int output = 0;
		String stringInput = String.valueOf(input);
		for(int i = 0; i < stringInput.length();i++) {
			int x = Integer.parseInt(String.valueOf(stringInput.charAt(i)));
			output += x*x;
		}
		
		return output;
	}

	public static String checkValid(int input) {
		String output = "";
		int sumSquare = ValidNumber.sumOfSquares(input);
		while (sumSquare != 1) {
			sumSquare = ValidNumber.sumOfSquares(sumSquare);
			if(sumSquare < 10 && sumSquare != 1) {
				output += "The number is invalid";
				break;
			}
		}
		if (sumSquare == 1) {
			output += "The number is valid";
		}
		
//		System.out.println(sumSquare);
		return output;
	}
	
	public static void main(String[] args) {
		String test = ValidNumber.checkValid(19);
		System.out.println(test);

	}

}
