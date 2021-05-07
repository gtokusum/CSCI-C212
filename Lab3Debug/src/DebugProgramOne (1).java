//  Lab 3
//
//  Released:  2/3/2021
//
//  @Author  Gaku Tokusumi and gtokusum
//  Last Edited: 2/5/2021
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

About the java file: The current Program computes Area of different shapes based on user input.

User Input: 
1. choice: User should enter either 1 or 2 depending on which shape the user wants to compute area for.
2. first_operand, second_operand: The operands on which the addition/subtraction operation is to be performed.

Expected Program Output:
The correct result for Addition and Subtraction operations

Eg: 
Find area of 
1 . Square
2 . Rectangle 
Select a choice : 2
Enter the breadth :
2
Enter the length :  
2
Area of rectangle with breadth 2 and length 2 is : 4
*/

import java.io.*;
import java.util.Scanner;

class DebugProgramOne {
    void findAreaRect(int width, int length) {
        System.out.println("\n Area of rectangle with width " + width + " and length " + length + " is: " + width * length);
    }

    void findAreaSquare(int side) {
        System.out.println("\n Area of square with side " + side + " is: " + side * side);
    }

    public static void main(String p[]) throws IOException {
        DebugProgramOne d = new DebugProgramOne();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n Find area of \n 1 . Square \n 2 . Rectangle \n\nSelect a choice: ");
        int choice = keyboard.nextInt();
   
        if(choice == 1) {
            System.out.print("\n Enter the side: ");
            int side = keyboard.nextInt();
            d.findAreaSquare(side);
        }

        else if(choice == 2) {
            System.out.print("\n Enter the width: ");
            int width = keyboard.nextInt();
            System.out.print("\n Enter the length: ");
            int length = keyboard.nextInt();
            d.findAreaRect(width, length);
        }

        else{
            System.out.println("Invalid choice");
        }
        keyboard.close();
    }
}