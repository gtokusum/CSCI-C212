//  Lab 2
//
//  Released:  1/27/2021
//
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited: 1/29/2021
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

About the java file: The current Program performs Square and Power operations.

User Input: 
1. choice: User should enter either 5 or 6 depending on which operation the user wants to perform.
2. first_operand, second_operand: The operands on which the Square/Power operation is to be performed.

Expected Program Output:
The correct result for Square and Power operations

Eg: 
Welcome to Square/Power Calculator:
Choose your operation:
5. Square
6. Power
Enter 5 for performing Square
Enter 6 for performing Power
5
Enter operand to be squared
4
The result of the operation is:
16
*/ 
import java.util.Scanner;

public class DebugProgramThree {

    public static void main(String[] args) {
        int result=0;
        System.out.println("Welcome to Square/Power Calculator:");
//      Initializing Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your operation:");
        System.out.println("1. Square\n2. Power");
        System.out.println("Enter 5 for performing Square");
        System.out.println("Enter 6 for performing Power");
//      Taking an int input using Scanner object
        int choice = sc.nextInt();
        if(choice==5){
            System.out.println("Enter operand to be squared");
            int first_operand = sc.nextInt();
            result=operationThree.square(first_operand);
        }
        else if(choice==6){
            System.out.println("Enter the base");
            int first_operand = sc.nextInt();
            System.out.println("Enter the power");
            int second_operand = sc.nextInt();
            result=operationThree.power(first_operand,second_operand);
        }
        System.out.println("The result of the operation is:"+result);
        sc.close();
    }
}
class operationThree{
//    function to perform square of an integer
    public static int square(int first_operand){
        int result=first_operand*first_operand;
        return result;
    }
//    function to calculate base integer raised to a power integer
    public static int power(int first_operand,int second_operand){
    	int result = first_operand;
        for(int i=1;i<second_operand;i++){
            result *= first_operand;
            
        }
        return result;
    }
}