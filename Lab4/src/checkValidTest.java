import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkValidTest {

	@Test
	void test() {
		String result1 = ValidNumber.checkValid(19);
		String result2 = ValidNumber.checkValid(68);
		String result3 = ValidNumber.checkValid(65896);
		String result4 = ValidNumber.checkValid(45970);
		String result5 = ValidNumber.checkValid(69240);
		
		assertEquals(result1, "The number is valid");
		assertEquals(result2, "The number is valid");
		assertEquals(result3, "The number is invalid");
		assertEquals(result4, "The number is invalid");
		assertEquals(result5, "The number is invalid");
	}

}
