
import java.util.Arrays;
import java.util.Scanner;

public class OnlineBookstore {
	
	//iterate through books[][] to filter price
	public static double[][] filterPrice(double[][]books,double price){
		double[][] filtered = new double[books.length][books[0].length];
		
		//check if price is lower than max price
		for (int i = 0; i< books.length;i++) {
			if (books[i][2] <= price && books[i][2] != 0) {
				for (int j = 0; j < books[0].length;j++) {
					filtered[i][j] = books[i][j];
				}
			}
		}
		return filtered;
	}

	//iterate through books[][] to filter rating
	public static double[][] filterRating(double[][]books,double rating){
		double[][] filtered = new double [books.length][books[0].length];
		
		//check if rating is higher than input rating
		for (int i = 0; i<books.length;i++) {
			if (books[i][3] > rating) {
				for (int j = 0; j <books[0].length;j++) {
					filtered[i][j] = books[i][j];
				}
			}
		}
		return filtered;
	}
	
	//iterate through books[][] to filter amount purchased
	public static double[][] filterPurch(double[][]books,double purchased){
		double [][] filtered = new double[books.length][books[0].length];
		
		//check if amount purchased is higher than input
		for (int i = 0; i<books.length;i++) {
			if (books[i][1] > purchased) {
				for (int j= 0;j<books[0].length;j++) {
					filtered[i][j] = books[i][j];
				}
			}
		}
		return filtered;
	}
	
	//main method for filtering books[][]
	public static int[] filterBooks(double[][]books,double price, double rating, double purchased) {
		int remainder = 0;
		double[][] remainingBooks = books;
		
		//check if input is -1 and if not filter books[][]
		if ((int)price != -1) {
			remainingBooks = OnlineBookstore.filterPrice(remainingBooks,price);
		}
		if ((int)rating != -1) {
			remainingBooks = OnlineBookstore.filterRating(remainingBooks, rating);
		}
		if ((int)purchased != -1) {
			remainingBooks = OnlineBookstore.filterPurch(remainingBooks,purchased);
		}
		
		//check how many books remaing after filtering
		for (int i = 0; i < remainingBooks.length; i++) {
			if (remainingBooks[i][0] != 0) {
				remainder += 1;
			}
		}
		
		//get Book ID from remaining books and add to output
		int[] output = new int[remainder];
		int tmpCount = 0;
		while (tmpCount != remainder) {
			for (int i = 0; i < remainingBooks.length;i++) {
				if (remainingBooks[i][0] != 0) {
					output[tmpCount] = (int)remainingBooks[i][0];
					tmpCount++;
				}
			}
		}
//		return Arrays.toString(output); 
//		System.out.println(Arrays.toString(output));
		return output;
	}
	
	public static void main(String[] args) {
							//ID, purch,price,usrRat
		double[][] books = {{1, 27000, 12.99, 4.5},
						{2, 5000, 45.8, 4.5}, 
						{3, 100, 78.0,2.1}, 
						{4, 3002, 20.19,1.7}, 
						{5, 31750, 45.0, 3.1} };
		Scanner sc = new Scanner(System.in);
//		double maxPrice = 30;
//		double minRating = -1;
//		double minPurchased = -1;
		String menu = "Enter double for price.'\n'Enter double for rating'\n'Enter double for purchased";
		System.out.println(menu);
		double maxPrice = sc.nextDouble();
		double minRating = sc.nextDouble();
		double minPurchased = sc.nextDouble();
		int[] test = OnlineBookstore.filterBooks(books, maxPrice, minRating, minPurchased);
		System.out.println(Arrays.toString(test));
		sc.close();

	}

}
