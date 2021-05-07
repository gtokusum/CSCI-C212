import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class hexToIntNBinTest {

	@Test
	void test() {
		String result1 = Lab3Exercises.hexToIntNBin("0x000A");
		String result2 = Lab3Exercises.hexToIntNBin("0x0032");
		String result3 = Lab3Exercises.hexToIntNBin("0x0064");
		String result4 = Lab3Exercises.hexToIntNBin("0x16B9");
		
		String testBase = "Your number is %d (in decimal) and %s (in binary)";
		String testCase1 = String.format(testBase, 10,"1010");
		String testCase2 = String.format(testBase, 50, "110010");
		String testCase3 = String.format(testBase, 100, "1100100");
		String testCase4 = String.format(testBase, 5817,"1011010111001");
		
		assertEquals(testCase1,result1);
		assertEquals(testCase2,result2);
		assertEquals(testCase3,result3);
		assertEquals(testCase4,result4);
		
	}

}
