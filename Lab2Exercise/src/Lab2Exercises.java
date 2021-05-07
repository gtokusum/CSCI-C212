//  Lab 2 
//  
//  Released:  1/20/20
//
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited:  1/29/21
//
//
//  Directions:  Implement the following methods 
//               
//               
//////////////////////////////////////////////////////////////////////////////////

// Note:  Do not need to explicitly import classes from java.lang but wanted to make it explicit 
// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects) 
// It is a class that provides functionality and will be used to complete one of the methods
import java.lang.Math;
import java.util.*;
public class Lab2Exercises {
    
    // computes area of a Circle when given its diameter
    public static int areaOfACircle(double diameter) {
      return (int) (Math.PI * Math.pow((diameter/2.0),2.0));
    }

    // computes circumference of a circle when given its diameter
    public static int circumferenceOfCircle(double diameter) {
      return (int) (2.0 * Math.PI * (diameter/2.0));
    }
       
    // Returns the count of vowels in the given String  
    public static int countVowels(String str) {
      int count = 0;
      for (int i = 0; i < str.length();i++) {
    	  char ch = str.charAt(i);
    	  if (ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch =='u') {
    		  count ++;
    	  }
      }
      return count;
    }
    
    // Use a Scanner to reads a number between 1000 and 1 Trillion and print it with commas (,) separating 
    // every three digits. for example: 12317910.67 will be printed as $12,317,910.67
    // You MUST use divide and/or modulus operators and may save part of the number, then concatenate back 
    // together as a String
    // You must use printf to print the combined string and everything else in this method. 
    // Question: There is an easier way to print a number with commas (,) separating every 3 digits without 
    // doing all the computations with %. What is it? Answer: Use printf .... How? write the code that will do it. 
    public static String addCommas(double usrNumber) {
    	String output = "$";
	    String input = String.format("%.2f", usrNumber);
	    int end = input.indexOf('.');
	    for (int i = 0; i <= end +2; i++) {
	    	if(i%3 == 0 && i != 0 && i != end && i != end +1 && i != end +2) {
	    		output = output+",";
	    		char num = input.charAt(i);
	    		String concat = Character.toString(num);
	    		output = output + concat;
	    	}
	    	
	    	else {
	    		char num = input.charAt(i);
	    		String concat = Character.toString(num);
	    		output = output+concat;
	    	}
	    }
	    
	    return output;
    	

		//using printf to add commas
//    	System.out.printf("%,.2f\n", usrNumber);
//		return "";
		
    	
    }
    
    // test client 
    public static void main(String[] args) {
      //TODO: Modify to test all methods from above.
      // Use Scanner to read inputs from user. Don't use Scanner inside above functions!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Double, String, and Double");
        double diameter = sc.nextDouble();
        String sentence = sc.next();
        double inputNumber = sc.nextDouble();
        System.out.println("Area of circle with diameter d = " + diameter + " " +areaOfACircle(diameter));
        System.out.println("Circumference of circle with diameter d = " + diameter + " " + circumferenceOfCircle(diameter));
        System.out.println("Word/Sentence has " + countVowels(sentence) + " vowels");
        System.out.println(addCommas(inputNumber));
        sc.close();
    }
}

////////////////////////////////////
//                                //
// ANSWER THE FOLLOWING QUESTIONS //
//                                //
////////////////////////////////////

/*
 * Questions 1-3 are on explicit and implicit casting of some numerical types  
 *
 * 1.  What happens if you multiply an int with a char? 
 * 	it will use the ASCII value of the char and the output would be the product of the ASCII value and the int
 * 2.  What happens if you multiply a double with a char? 
 * 	It will be the same with the above but with decimals
 * 3.  What happens if you square a char? 
 * 	The ASCII value would be squared
 * 4.  What happens if a method has a parameter of type int, but you pass it a char?
 * 	the parameter would convert to the ASCII value of the char
 * 5.  What happens if a method has a parameter of type char, but you pass it an int? 
 * 	you will get an error
 * 6.  What is the difference between two floating point primitive data types in the Java?
 * 	float has a size of 32 bits and double has a size of 64 bits
 * 7.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 * 
 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 *     i == 14 and n == 11
 *     
 *     What are the final value printed?
 *     3
 *     
 *     Now Compile and Run the Program to check your answers. If they are different, explain why 
 *     and provide updated code!
 *     
 *     compiling the program threw an exception in the thread due to an invalid argument to operation.
 *     So the code would not run. to fix:
 *     int i = 10;
 *     i++;
 *     int n = ++i;
 *     i ++;
 *     System.out.println(++i % 5)
 *     and n = 12, i = 14, and ++i % 5 = 4.
 *     
 * 8.  If I define a class as below:  
 *     class calc {
 *            public static int addOperation(int firstOperand, int sop){
 *                   return firstOperand+sop;
 *            }
 *            ...
 *     }
 *     Looking at Java Coding Conventions, what suggestions would you give for code refactoring?
 *     
 *     Change the int sop to int secondOperand
 *     
 * 9.  int i = 10000000 * 100000000;
 *	   System.out.println(i);
 *  
 *     Why does the code above print a weird answer? How will you fix it (for same computation)?
 *     
 *     The code does not print the right answer because the result of the product is too big for the primitive int variable.
 *     to fix it declare i as long i = 10000000L * 100000000L;
 */
