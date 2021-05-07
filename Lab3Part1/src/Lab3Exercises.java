
import java.util.Scanner;

//  Lab 3
//
//  Released:  2/3/2021
//
//  @Author  Gaku Tokusumi and gtokusum
//  Last Edited: 2/5/2021
//////////////////////////////////////////////////////////////////////////////


public class Lab3Exercises {
	
	//method to reverse int for my1089Puzzle 
	public static int reversedInt(int IntReverse) {
//		initialize variables
		int input = IntReverse;
		int reverse = 0;
//		reverse the number
		for(;input != 0; input /= 10) {
			int dig = input  % 10;
			reverse = reverse * 10 + dig;
		}
//		check if reversed number is 3 digits long and multiply by 10 or 100 to get 3 digits
		if(reverse >= 100) {
		return reverse;
		}
		else {
			if(reverse < 10) {
				return reverse * 100;
			}
			else {
				return reverse * 10;
			}
		}
	}

	
	public static int my1089Puzzle(int myinput) {
//		initialize variables for method
		int input = myinput,reversed = 0, difference = 0, sum = 0;
		
//		check if input is over 3 digits long
		if(input > 999) {
			String tmp = String.valueOf(input);
			input = Integer.parseInt(tmp.substring(tmp.length()-3));
		}
//		reverse input using reversedInt helper method
		reversed = Lab3Exercises.reversedInt(input);
		difference = input - reversed;
		
		//check if difference is neg
		if (difference < 0) {
			difference *= -1;
		}
//		get sum
		sum = difference + Lab3Exercises.reversedInt(difference);
		return sum;
	}
	
	
	public static String computeBothEnds(String Input) {
//		initialize variables used for method
		String output = "";
		String forbidden = "!@#$%^&*()_-+=:;',.?/|`~";
		String[] strList = Input.split(" ");
//		check if input is null
		if (Input.length() == 0) {
			return output;
		}
		else {
			
//			iterate through the array of words 
			for (int i = 0; i < strList.length; i++) {
				if(!strList[i].isBlank()) {
					for (int j = 0; j < forbidden.length();j++) {
						
//						check if the word has a forbidden character
						if (strList[i].contains(String.valueOf(forbidden.charAt(j)))) {
							strList[i] = strList[i].replaceAll(String.valueOf(forbidden.charAt(j)), "");
						}
					}
//					add first and last word to output
					output += String.valueOf(strList[i].charAt(0));
					output += strList[i].substring(strList[i].length()-1);
				}
			}
		}
		return output;
	}
	
	public static String randomGradeGenerator(int numAssignments) {
		String output = "";
		String grades = "ABCDF";
	
		for (int i = 0; i < numAssignments; i++) {
			int randNum = (int)(Math.random() * 5) ;
			double randPlusMinus = Math.random();
			if (randPlusMinus < .25 && randNum != 4) {
				output += "-";
			}
			else if(randPlusMinus > .75 && randNum != 4) {
				output += "+";
			}
			output += String.valueOf(grades.charAt(randNum)) + ",";
			}
		
		
		return output;
	}

	public static String hexToIntNBin(String hexInput) {
		String tmpHex = hexInput.toUpperCase();
		int decimal = 0;
		String binary = "";
		String hex = tmpHex.substring(2);
		decimal = Integer.parseInt(hex,16);
		binary += Integer.toBinaryString(decimal);
		String output = String.format("Your number is %d (in decimal) and %s (in binary)", decimal,binary);
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
//		System.out.println(Lab3Exercises.my1089Puzzle(first));
//		System.out.println(Lab3Exercises.my1089Puzzle(second));
//		System.out.println(Lab3Exercises.my1089Puzzle(third));
//		String first = sc.next(), second = sc.next(), third = sc.next();
//		System.out.println(Lab3Exercises.computeBothEnds(first));
//		System.out.println(Lab3Exercises.computeBothEnds(second));
//		System.out.println(Lab3Exercises.computeBothEnds(third));
		sc.close();
//		System.out.println(Lab3Exercises.computeBothEnds("it @i@s@!"));
//		System.out.println(Lab3Exercises.randomGradeGenerator(7));
		System.out.println(Lab3Exercises.hexToIntNBin("0x0064"));
	}

}
