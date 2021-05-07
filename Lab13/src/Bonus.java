import java.util.HashMap;
import java.util.Map;

public class Bonus {

	/**
	 * sorts the arg array
	 * @param int[] a
	 */
	static void bubble(int[] a) {
		boolean sorted = false;
		int tmp;
		while (!sorted) {
			sorted = true;
			for(int i = 0; i < a.length-1;i++) {
				if (a[i] > a[i+1]) {
					tmp = a[i];
					a[i] = a[i+1];
					a[i+1] =tmp;
					sorted = false;
				}
			}
		}
	}
	
	/**
	 * add int n to array a
	 * @param int[] a
	 * @param int n
	 * @return int[]
	 */
	static int[] insert(int[] a, int n) {
		int l = a.length;
		int out[] = new int[l+1];
		for (int i = 0; i < l;i++) {
			out[i] = a[i];
		}
		out[l] = n;
		return out;
	}
	
	/**
	 * gets the indicies of nums in range
	 * @param int[] a
	 * @param int[] key
	 * @return String
	 */
	static String range(int[] a, int[] key) {
		if (key.length != 2) {
			return "too many values in key";
		}
		int[] array = a;
		Bonus.bubble(array);
		Bonus.bubble(key);
		String output = "The elements between " + key[0] +" and " + key[1] +" are found at position:\n";
		int low = key[0];
		int high = key[1];
		int indicies[] = {0};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], 0);
		}
		for (int i = 0; i < array.length;i++) {
			if (array[i] > low && array[i] < high) {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		if (map.size() == 0) {
			return "-1";
		}
		else {
			for (Map.Entry<Integer,Integer> m:map.entrySet()) {
				int count = m.getValue();
				while(count > 0) {
					for (int i = 0; i < a.length;i++) {
						if (a[i] == m.getKey()) {
							count--;
//							System.out.println("count" + count);
							System.out.println(i);
							indicies = Bonus.insert(indicies, i);
						}
					}
					
				}
			}
		}
		
		
		Bonus.bubble(indicies);
		for (int i = 1; i < indicies.length;i++) {
			output = output + indicies[i] + ",";
		}
		
		return output.substring(0,output.length()-1);
	}

	
	public static void main(String[] args) {
		int input[] = {1,5,4,0,9,9,6,7,8,1,1,3,5,0,9,7,3,0,8,6};
		int key[] = {5,10};
		System.out.println(Bonus.range(input,key));
	}

}
