////////////////////////////////////////////////////////////////////////////////////
//  C212
//  Released:  1/20/21
//  Lab 2
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited:  1/29/21
//
//  Directions: See Below 
//               
//////////////////////////////////////////////////////////////////////////////////

class Lab2CompoundExercises {

	// 1. Review the following method (differentOperators): 
	// 1a. Change it to use ONLY compound assignment operators. All printf statements should print same values. 
	// 1b. Repeat with either pre- or post- increment/decrement statements ONLY as appropriate.
     public static void differentOperators(){
          
          int result = -1; // result is -1
          System.out.println(result);

          --result; // result is now -2
          System.out.println(result);

          result /=  -2; // result is now 1
          System.out.println(result);

          result *= -6; // result is now -6
          System.out.println(result);

          result %= 4; // result is now -2
          System.out.println(result);
          
          ++result; // result is now -1
          System.out.println(result);
     }
     
// 2. In the following program, explain why the value "-4" is printed thrice in a row:
     public static void question2() {
        int i = -5;
        i++;
        System.out.println(i);    // "-4"
        ++i;                     
        System.out.println(i);    // "-3"
        System.out.println(--i);  // "-4"
        System.out.println(i--);  // "-4"
        System.out.println(++i);  // "-4"
        
        //if the operators are BEFORE the variable the increment will be carried out before the assignment
        //if the operators are AFTER the variable the increment will be carried out after the assignment
     }
}





