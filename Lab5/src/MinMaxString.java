import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxString {
	
	//get max and min for sum of string
	public static int[] getMinMax (ArrayList<String> stringList) {
		
		//initialize variables
		int[] output = new int[2];
		ArrayList<Integer> sumArrayList = new ArrayList<Integer>();
		
		//iterate through list and string
		for (int i = 0; i < stringList.size();i++) {
			int tmpNum = 0;
			String tmpWord = stringList.get(i);
			
			//add up ASCII values and add to array
			for (int j = 0; j < tmpWord.length(); j++) {
				tmpNum += (int)tmpWord.charAt(j);
			}
			sumArrayList.add(tmpNum);
		}
		
		//get min and max of sum array
		int min = sumArrayList.get(0);
		int max = sumArrayList.get(0);
		for (int i = 0; i < sumArrayList.size();i++) {
			if (sumArrayList.get(i) > max) {
				max = sumArrayList.get(i);
			}
			if (sumArrayList.get(i) < min) {
				min = sumArrayList.get(i);
			}
		}
		output[0] = min;
		output[1] = max;
//		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of words");
		int N = sc.nextInt();
		ArrayList<String> myArrayList = new ArrayList<String>();
		System.out.println("Enter " + N + " words");
		for (int i = 0; i < N ;i++) {
			myArrayList.add(sc.next());
		}
		int[] test = MinMaxString.getMinMax(myArrayList);
		System.out.println(Arrays.toString(test));
		
		
		sc.close();

	}

}
