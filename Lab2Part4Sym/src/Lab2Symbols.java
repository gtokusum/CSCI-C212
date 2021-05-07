//  Lab 2 
//  
//  Created: 1/29/20
//
//  @Author  Gaku Tokusumi, gtokusum
//  Last Edited:  1/29/21
//
//
//  Directions:  Implement the following methods 
//               
//               
//////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

public class Lab2Symbols {
	
	//take an int as argument and convert into the ASCII character
	//that corresponds to that integer
	public char ASCII(int convertInt) {
		return (char)convertInt;
	}
	
	//using scanner to find take input of integer to convert to char
	public static void main(String[] args) {
		Lab2Symbols obj = new Lab2Symbols();
		Scanner sc = new Scanner(System.in);
		int firstInt = sc.nextInt();
		int secondInt = sc.nextInt();
		int thirdInt = sc.nextInt();
		System.out.println(obj.ASCII(firstInt));
		System.out.println(obj.ASCII(secondInt));
		System.out.println(obj.ASCII(thirdInt));
		sc.close();
	}
	
	
	
	
}

