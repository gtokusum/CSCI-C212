import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class replaceVowelsTest {
	//A = Z, E = V, I = R, O = L, U= F
	@Test
	void test() {
//		Lab2Vowels obj = new Lab2Vowels();
		String result1 = Lab2Vowels.replaceVowels("AaEeIiOoUu");
		String result2 = Lab2Vowels.replaceVowels("asdaeworjadf");
		String result3 = Lab2Vowels.replaceVowels("[]-=\\|!@fasd'.,jig");
		String result4 = Lab2Vowels.replaceVowels("123124aaa244**&$#@");
		String result5 = Lab2Vowels.replaceVowels("Gaku Tokusumi");
		
		assertEquals("ZzVvRrLlFf",result1);
		assertEquals("zsdzvwlrjzdf",result2);
		assertEquals("[]-=\\|!@fzsd'.,jrg",result3);
		assertEquals("123124zzz244**&$#@",result4);
		assertEquals("Gzkf Tlkfsfmr",result5);
	}

}
