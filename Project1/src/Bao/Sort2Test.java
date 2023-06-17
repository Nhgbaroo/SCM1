package Bao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import NguyenHuu.Sort2;
class Sort2Test {

	@Test
	void test1() {
		Sort2 a = new Sort2(6,9);
		a.sortDesc();
		Sort2 b = new Sort2(6,9);
		assertTrue(b.equals(a));
	}
	@Test
	void test2() {
		Sort2 a = new Sort2(5,3);
		a.sortDesc();
		Sort2 b = new Sort2(3,5);
		assertTrue(a==b);
	}

}
