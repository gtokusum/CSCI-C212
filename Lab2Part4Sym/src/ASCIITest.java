import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ASCIITest {
	//test char A Z X a c u 0 9 2 $ * > - |
	@Test
	void test() {
		Lab2Symbols obj = new Lab2Symbols();
		char result_A = obj.ASCII(65);
		char result_Z = obj.ASCII(90);
		char result_X = obj.ASCII(88);
		char result_a = obj.ASCII(97);
		char result_c = obj.ASCII(99);
		char result_0 = obj.ASCII(48);
		char result_9 = obj.ASCII(57);
		char result_2 = obj.ASCII(50);
		char result_$ = obj.ASCII(36);
		char result_star = obj.ASCII(42);
		char result_greater = obj.ASCII(62);
		char result_minus = obj.ASCII(45);
		char result_line = obj.ASCII(124);

		assertEquals('A',result_A);
		assertEquals('Z',result_Z);
		assertEquals('X',result_X);
		assertEquals('a',result_a);
		assertEquals('c',result_c);
		assertEquals('0',result_0);
		assertEquals('9',result_9);
		assertEquals('2',result_2);
		assertEquals('$',result_$);
		assertEquals('*',result_star);
		assertEquals('>',result_greater);
		assertEquals('-',result_minus);
		assertEquals('|',result_line);
	}

}
