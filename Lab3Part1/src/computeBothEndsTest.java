import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class computeBothEndsTest {

	@Test
	void test() {
		String result1 = Lab3Exercises.computeBothEnds("Hello World");
		String result2 = Lab3Exercises.computeBothEnds("Isn't it wonderful");
		String result3 = Lab3Exercises.computeBothEnds("@!Ubuntu is better than Windows");
		
		assertEquals("HoWd",result1);
		assertEquals("Ititwl",result2);
		assertEquals("UuisbrtnWs",result3);
	}

}
