import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class LargeRectangles {
	
	
	
	//find rectangles above threshold
	public ArrayList<MyRectangle> findRectangles(ArrayList<MyRectangle> rectangleList,double thresholdArea){
		
		//initialize variable
		ArrayList<MyRectangle> aboveThreshold = new ArrayList<MyRectangle>();
//		ArrayList<Integer> threshIndex = new ArrayList<Integer>();
		
		//iterate through list and compare area to threshold
		for (int i = 0; i < rectangleList.size(); i++) {
			if (rectangleList.get(i).rectBreadth * rectangleList.get(i).rectLength >= thresholdArea) {
				aboveThreshold.add(rectangleList.get(i));
			}
		}
		
		
		return aboveThreshold;
	}

	public static void main(String[] args) {
		ArrayList<MyRectangle> rectList = new ArrayList<MyRectangle>();
		Random rand = new Random();
		int n = 0;
		
		//get random list of rectangles with length and width between 1 and 11
		while (n < 11) {
			int length = rand.nextInt(11);
			int width = rand.nextInt(11);
			if (length > 0 && width > 0){
				MyRectangle tmpRect = new MyRectangle(length,width);
				rectList.add(tmpRect);
				n++;
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Input threshold");
		int thresh = sc.nextInt();
		for (int i = 0; i < rectList.size();i++) {
			System.out.println(i+1 + " " + rectList.get(i).getAll());
		}
		System.out.println("\n\n\n\n");
		LargeRectangles obj = new LargeRectangles();
		ArrayList<MyRectangle> filtRects = obj.findRectangles(rectList, thresh);
		System.out.println("Rectangles over area threshold:");
		for (int i = 0; i < filtRects.size();i++) {
			String beg = "R" + (i+1) + " - ";
			MyRectangle tmpRect = filtRects.get(i);
			System.out.println(beg + tmpRect.getAll());
		}
		sc.close();
	}

}
