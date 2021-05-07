import java.util.Scanner;

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
public class DesignPatterns {

	public static String patternA(int size) {
		String output = "";
		
		//get area of square
		int area = size*size;
		
		//concat 0 and 1 to output
		for (int i = 1; i < area + 1; i++) {
			if (i == 0 || i % 2 == 0) {
				output += "0";
			}else {
				output += "1";
			}
			
			//add new line
			if (i % size == 0 && i != 0) {
				output += "\n";
			}
		}
		
		return output;
	}
	
	public static String patternB(int size) {
		String output = "";
		String topHalf = "";
		String star = "*";
		
		//add appropriate amount of stars and new line to topHalf
		for (int i = 1; i < size ; i++) {
			topHalf += star.repeat(i);
			topHalf += "\n";
		}
		
		//reverse topHalf to get bottom half and the middle row of stars and concat all together
		StringBuilder bottomHalf = new StringBuilder(topHalf);
		output += topHalf + star.repeat(size) + "\n" + bottomHalf.reverse().substring(1);
		return output;
	}
	
	public static String patternC(int size) {
		String output = "";
		String alphabet = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ";
		
		//use alphabet string to concat top half to output
		for (int i = size+1; i >= 0 ; i--) {
			output += alphabet.substring(0,i*2) + "\n";
		}
		
		//get rid of unnecessary \n at end of output
		output = output.substring(0,output.length() - 1);
		
		//use alphabet string to concat the bottom half to output
		for (int i = 1 ; i < size + 2; i++) {
			output += alphabet.substring(0,i*2) + "\n";
		}
		
		
		return output;
	}
	
	public static String patternD(int size) {
		String output = "";
		String star = "* ";
		String topHalf = "";
		String space = " ";
		
		//tmpNum used to calculate the amount of spaces needed
		int tmpNum = 1;
		
		//create top half of shape
		for (int i = size; i > 0; i--) {
			topHalf += space.repeat(tmpNum/2);
			topHalf += star.repeat(i) + "\n";
			tmpNum += 2;
		}
		
		String bottomHalf = "";
		tmpNum = size;
		
		//create bottom half to shape
		for (int i = 1; i < size + 1; i++) {
			bottomHalf += space.repeat(tmpNum-1);
			bottomHalf += star.repeat(i) + "\n";
			tmpNum -= 1;
		}
		
		//add shapes together
		output += topHalf + bottomHalf;
		return output;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		String menu = "A: pattern 1 \nB: pattern 2\nC: pattern 3\nD: pattern 4\nE: to exit";
		String askSize = "Please enter the size of shape: ";
		System.out.println(menu);
		while (start) {
			String usrChoice = sc.next();
			if(usrChoice.equals("A")) {
				System.out.println(askSize);
				int input = sc.nextInt();
				System.out.println(DesignPatterns.patternA(input));
				System.out.println(menu);
			}
			if (usrChoice.equals("B")) {
				System.out.println(askSize);
				int input = sc.nextInt();
				System.out.println(DesignPatterns.patternB(input));
				System.out.println(menu);
			}
			if (usrChoice.equals("C")) {
				System.out.println(askSize);
				int input = sc.nextInt();
				System.out.println(DesignPatterns.patternC(input));
				System.out.println(menu);
			}
			if (usrChoice.equals("D")) {
				System.out.println(askSize);
				int input = sc.nextInt();
				System.out.println(DesignPatterns.patternD(input));
				System.out.println(menu);
			}
			if(usrChoice.equals("E")){
				start = false;
				sc.close();
			}
		}
	
	}

}
