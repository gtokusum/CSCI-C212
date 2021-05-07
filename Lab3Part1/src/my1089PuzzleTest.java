import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class my1089PuzzleTest {

	@Test
	void test() {
		int result = Lab3Exercises.my1089Puzzle(371);
		int result2 = Lab3Exercises.my1089Puzzle(123);
		int result3 = Lab3Exercises.my1089Puzzle(932);
		
		
		assertEquals(1089,result);
		assertEquals(1089,result2);
		assertEquals(1089,result3);
	}

}
