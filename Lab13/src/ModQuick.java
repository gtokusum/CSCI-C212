


public class ModQuick {

	//modifing quicksort
	public static void quick_srt(int array[],int low, int n){
		int lo = low;
		int hi = n;
		if (lo >= n) {
			return;
		}
		int mid = array[(lo + hi) / 2];
		while (lo < hi) {
			while (lo<hi && array[lo] < mid) {
				lo++;
			}
			while (lo<hi && array[hi] > mid) {
				hi--;
			}
			if (lo < hi) {
				int T = array[lo];
				array[lo] = array[hi];
				array[hi] = T;
			}
		}
		if (hi < lo) {
			int T = hi;
			hi = lo;
			lo = T;
		}
		quick_srt(array, low, lo);
		quick_srt(array, lo == low ? lo+1 : lo, n);
	}
		
	
	public static void main(String[] args) {
		int[] a = {6,9,3,99,89,1,7,19,12};
		ModQuick.quick_srt(a, 0, a.length-1);
		for (int i: a) {
			System.out.print(i+" ");
		}
	}

}
