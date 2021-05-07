import java.util.Scanner;

public class FindOccurence {
	
	public static String findIndices(String inputString,char inputChar,boolean caseSensitive) {
		String output = "";
		int occurence = 0;
		String indicies = "";
		String input;
		if (!caseSensitive) {
			input = inputString.toLowerCase();
		}
		else {
			input = inputString;
		}
		for (int i = 0; i < input.length();i++) {
			char tmpChar = input.charAt(i);
			if(tmpChar == inputChar) {
				occurence++;
				indicies += String.valueOf(i)+ ", ";
			}
		}
		output += "I found " + occurence +" total occurrences at indicies " + indicies.substring(0,indicies.length()-2);
		
		return output;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input Sentence\nInput character to match\nInput true or false for case sensitive");
		String inputString = in.nextLine();
		String inputMatch = in.next();
		char inputChar = inputMatch.charAt(0);
		boolean caseSensitive = in.nextBoolean();
		String toPrint = FindOccurence.findIndices(inputString, inputChar, caseSensitive);
		System.out.println(toPrint);
		in.close();
		
		
		
		
		
//		String x = "My million Melons?";
//		String s = x.toLowerCase();
//		char lookChar = (char) inputChar;
//		String indices = "";
//		int occurence = 0;
//		for (int i =0; i < s.length();i++) {
//			char tmpChar = s.charAt(i);
//			if (tmpChar == lookChar) {
//				occurence++;
//				indices += String.valueOf(i) + " ";
//			}
//		}
//		System.out.println("I found " + occurence + " toal occurrences at indicies " + indices);
//		System.out.println(indices);

	}

}
