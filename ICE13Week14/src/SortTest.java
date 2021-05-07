import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class SortTest {
	
	double[] array;
	ArrayList<Double> list;
	
	public SortTest() {
		array = populate();
		list = listPopulate();
	}
	
	public double[] populate() {
		double[] output = new double[1000000];
		int index = 0;
		DecimalFormat df = new DecimalFormat("###.####");
		for (double i = 100; i < 200;i+= 0.0001) {
			output[index] = Double.parseDouble(df.format(i));
			index++;
		}
		return output;
	}
	
	public ArrayList<Double> listPopulate(){
		ArrayList<Double> output = new ArrayList<Double>(); 
		for (double i = 100; i < 200; i+= 0.0001) {
			output.add(i);
		}
		return output;
	}
	
	public double getRandom() {
		DecimalFormat df = new DecimalFormat("###.####");
		return Double.parseDouble(df.format(ThreadLocalRandom.current().nextDouble(100,200)));
	}
	
	public void linearSearchArray() {
		double[] random = new double[10];
		for (int i = 0; i < 10; i++) {
			random[i] = getRandom();
		}
		for (double i: random) {
			long start = System.nanoTime();
			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					long end = System.nanoTime();
					long time = end - start;
					System.out.println(i + " found at index " + j + ". Time elapsed: " + time + "ns");
				}
			}
		}
	}
	
	public void binarySearchArray() {
		double[] random = new double[10];
		for (int i = 0; i < 10; i++) {
			random[i] = getRandom();
		}
		for (double i: random) {
			long start = System.nanoTime();
			int index = Arrays.binarySearch(array, i);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println(i + " found at index " + index + ". Time elapsed: " + time + "ns");
		}
	}

	public void linearSearchList() {
		double[] random = new double[10];
		for (int i = 0; i < 10; i++) {
			random[i] = getRandom();
		}
		for (double i: random) {
			long start = System.nanoTime();
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == i) {
					long end = System.nanoTime();
					long time = end-start;
					System.out.println(i + " found at index " + j + ". Time elapsed: " + time + "ns");
				}
			}
		}
	}
	
	public void binarySearchList() {
		double[] random = new double[10];
		for (int i = 0; i < 10; i++) {
			random[i] = getRandom();
		}
		for (double i: random) {
			long start = System.nanoTime();
			int index = Collections.binarySearch(list, i);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println(i + " found at index " + index + ". Time elapsed: " + time + "ns");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		SortTest test = new SortTest();
		System.out.println("Array Linear Search");
		test.linearSearchArray();
		System.out.println("\nArray Binary Search");
		test.binarySearchArray();
		System.out.println("\nList Linear Search");
		test.linearSearchList();
		System.out.println("\nList Binary Search");
		test.binarySearchList();
		
	}

}
