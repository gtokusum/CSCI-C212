

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class getMinMaxTest {

	@Test
	void test() {
		ArrayList<String> firstCase = new ArrayList<String>(Arrays.asList("John","Nick","Alex"));
		ArrayList<String> secondCase = new ArrayList<String>(Arrays.asList("hello","Hello","HELLO"));
		ArrayList<String> thirdCase = new ArrayList<String>(Arrays.asList("Mike","Jack","Jake"));
		
		int[] result1 = MinMaxString.getMinMax(firstCase);
		int[] result2 = MinMaxString.getMinMax(secondCase);
		int[] result3 = MinMaxString.getMinMax(thirdCase);
		
		int[] expected1 = {389,399};
		int[] expected2 = {372,532};
		int[] expected3 = {377,390};
		
		Assert.assertArrayEquals(expected1, result1);
		Assert.assertArrayEquals(expected2, result2);
		Assert.assertArrayEquals(expected3, result3);
		
	
	}

}
