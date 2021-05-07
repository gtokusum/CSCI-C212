import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkEligTest {

	@Test
	void test() {
		boolean result1 = GetReward.checkElig("PAPPLLP");
		boolean result2 = GetReward.checkElig("PPPPAAALLLL");
		boolean result3 = GetReward.checkElig("PALPLLPP");
		boolean result4 = GetReward.checkElig("APLLPP");
		
		assertEquals(true,result1);
		assertEquals(false,result2);
		assertEquals(true,result3);
		assertEquals(true,result4);
	}

}
