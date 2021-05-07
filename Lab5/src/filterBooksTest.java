import org.junit.Assert;
import org.junit.jupiter.api.Test;

class filterBooksTest {

	@Test
	void test() {
		double[][] book1 = {{1, 27000, 12.99, 4.5}, {2, 5000, 45.8, 4.5}, {3, 100, 78.0,2.1}, {4, 3002, 20.19,1.7}, {5, 31750, 45.0, 3.1} };
		double[][] book2 = { {1, 27000, 12.99, 4.5}, {2, 5000, 45.8, 4.5}, {3, 100, 78.0,2.1 }, {4, 3002, 20.19,1.7}, {5, 31750, 45.0, 3.1}};
		
		int[] result1 = OnlineBookstore.filterBooks(book1, 30, -1, -1);
		int[] result2 = OnlineBookstore.filterBooks(book2, 50, 3.6,-1);
		
		int[] expected1 = {1,4};
		int[] expected2 = {1,2};
		
		Assert.assertArrayEquals(expected1,result1);
		Assert.assertArrayEquals(expected2,result2);
	}

}
