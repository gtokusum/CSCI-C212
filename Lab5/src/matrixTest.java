import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class matrixTest {

	@Test
	void test() {
		int[][] test = new int[][] {{1,2,3,8},{0,9,0,8},{0,6,1,10},{1,5,0,12}};
		Matrix testString = new Matrix(test);
		String resultString = testString.toString();
		assertEquals("[1, 2, 3, 8\n"
				+ "0, 9, 0, 8\n"
				+ "0, 6, 1, 10\n"
				+ "1, 5, 0, 12]",resultString);
		
		int[][] tran1 = new int[][] {{5,4,3},{4,0,4},{7,10,3}};
		int[][] tran2 = new int[][] {{5,4},{4,0},{7,10},{-1,8}};
		Matrix transpose1 = new Matrix(tran1);
		Matrix transpose2 = new Matrix(tran2);
		assertEquals("[5, 4, 7\n"
				+ "4, 0, 10\n"
				+ "3, 4, 3]",transpose1.transposeMatrix().toString());
		assertEquals("[5, 4, 7, -1\n"
				+ "4, 0, 10, 8]",transpose2.transposeMatrix().toString());
		
		assertEquals(true,testString.isSquareMatrix());
		assertEquals(false,transpose2.isSquareMatrix());
		
		int[][] toAdd = new int[][] {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		int[][] toAdd2 = new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		Matrix add = new Matrix(toAdd);
		Matrix add2 = new Matrix(toAdd2);
		assertEquals("[2, 3, 4, 5\n"
				+ "6, 7, 8, 9\n"
				+ "10, 1, 2, 3]",add.add(add2).toString());
		
		int[][] multiply = new int[][] {{1,2},{3,4},{5,6},{7,8}};
		Matrix toMultiply = new Matrix(multiply);
		assertEquals("[50, 60\n"
				+ "114, 140\n"
				+ "28, 40]",add.multiply(toMultiply).toString());
	}
	

}
