//  Lab 2 
//  
//  Created: 1/29/20
//
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited:  1/31/21
//
//
//  Directions:  Implement the following methods 
//               
//               
//////////////////////////////////////////////////////////////////////////////////

/*replace Vowels method return a new string replacing each vowel in
 * the given string with the opposite letter.
 * A = Z, E = V, I = R, O = L, U= F
 * 
 * Design:
 * using the string method .replaceAll() to iterate through each vowel (lower and upper) 
 * and replace them with the opposite letter
 */

import java.util.*;

public class Lab2Vowels {
	
//	Using .replaceAll method to switch the vowels with the opposite letter
	public static String replaceVowels(String inputString) {
		String output = inputString;
		output = output.replaceAll("[A]", "Z");
		output = output.replaceAll("a","z");
		output = output.replaceAll("E", "V");
		output = output.replaceAll("e", "v");
		output = output.replaceAll("I","R");
		output = output.replaceAll("i","r");
		output = output.replaceAll("O", "L");
		output = output.replaceAll("o", "l");
		output = output.replaceAll("U", "F");
		output = output.replaceAll("u", "f");
		return output;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(Lab2Vowels.replaceVowels(sentence));
		sc.close();
	}
	
}
