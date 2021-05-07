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

About the java file: The current Program performs Multiplication and Division operations.

User Input: 
1. choice: User should enter either 3 or 4 depending on which operation the user wants to perform.
2. first_operand, second_operand: The operands on which the Multiplication/Division operation is to be performed.

Expected Program Output:
The correct result for Multiplication and Division operations

Eg: 
Welcome to Multiplication/Division Calculator:
Choose your operation:
3. Multiplication
4. Division
Enter 3 for performing Multiplication
Enter 4 for performing Division
4
Enter first operand
5
Enter second operand
6
The result of the operation is:0.8333333
*/
import java.util.Scanner;

public class DebugProgramTwo {

    public static void main(String[] args) {
        float result=0;
        //        Initializing Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication/Division Calculator:");
        System.out.println("Choose your operation:");
        System.out.println("3. Multiplication\n4. Division");
        System.out.println("Enter 3 for performing Multiplication");
        System.out.println("Enter 4 for performing Division");
//        Taking an int input using Scanner object
        int choice = sc.nextInt();
        System.out.println("Enter first operand");
        int first_operand = sc.nextInt();
        System.out.println("Enter second operand");
        int second_operand = sc.nextInt();
        if(choice==3){
            result=operationTwo.multiply(first_operand,second_operand);
        }
        else if(choice==4){
            result=operationTwo.divide(first_operand,second_operand);
        }
        System.out.println("The result of the operation is: "+result);
        sc.close();
    }
}
class operationTwo{
//    function to multiply 2 integers
    public static float multiply(int first_operand,int second_operand){
        return first_operand*second_operand;
    }
//    function to divide 2 integers
    public static float divide(int first_operand,int second_operand){
        return first_operand/second_operand;
    }

}