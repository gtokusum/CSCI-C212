//  Lab 3
//
//  Released:  2/3/2021
//
//  @Author  Your Name and username
//  Last Edited: 1/27/2021
//
//
//  Directions: The given file is not according to java coding guidelines
//              and may have compilation errors to be fixed. 
//              Tasks to be performed:
//              1. Edit the file to make it according to java coding guidelines 
//              and fix the errors if any.
//              2. Include comments to indicate the changes made to the file 
//              to make it according to coding conventions or fix issues.
//
//////////////////////////////////////////////////////////////////////////////



/*

Note: The file is a standalone java file, meaning you can run this file directly without having to set up the other 2 files.

About the java file: The current Program uses string built in functions like length(), charAt(), concat() and substring(). 

Expected Program Output:
The correct result for this program

Eg: 

*/ 
import java.io.*;

class DebugProgramThree { 

public static void main(String p[]) throws IOException
 	{
    String str = "This is a debugging exercise";
    int len = str.length();

    char ch1 = str.charAt(len);
    System.out.println("The last character of the string is "+ch1);
    
    String str1 = "Hello";
    String str2 = " World";
    
    System.out.println(str1.concat(str2));
    
    System.out.println(str.replace('i', 'K'));
    
    System.out.println("Substring starting from index 15:");
    System.out.println(str.substring(15));
    System.out.println("Substring starting from index 15 and ending at 20:");
    System.out.println(str.substring(15, 21));
 	}	
}