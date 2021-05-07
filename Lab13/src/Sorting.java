
public class Sorting {
	
	/**
	 * inserts num into input array
	 * @param int[] input
	 * @param int num
	 * @return int[]
	 */
	public int[] insert(int[] input,int num) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length;i++) {
			output[i] = input[i];
		}
		int n = input.length;
		output[n] = num;
		return output;
	}

	/**
	 * sorts the array input
	 * @param int[] input
	 * @return int[]
	 */
	public int[] sort(int[] input) {
		int[] asc = new int[1];
		int[] des = new int[1];
		if (input[0] <= input[1]) {
			asc = insert(asc,input[0]);
		}else {
			des = insert(des,input[0]);
		}
		for (int i = 1; i < input.length -1; i++) {
			if (input[i] <= input[i+1]) {
				asc = insert(asc,input[i]);
			}
			else {
				des = insert(des,input[i]);
			}
		}
		
		for (int i: asc) {
			System.out.println(i);
		}
		for (int i: des) {
			System.out.println(i);
		}
		return asc;
	}
	


	public static void main(String[] args) {
		int input[] = {2,3,6,1,9,7,5,4};
		Sorting test = new Sorting();
		test.sort(input);

	}

}
