package Bao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import NguyenHuu.MaxNumber2;

class MaxNumber2Test {

	@Test
	void test1() {
		MaxNumber2 a = new MaxNumber2();
		assertEquals(5,a.max2(5, 2));
	}
	@Test
	void test2() {
		MaxNumber2 a = new MaxNumber2();
		assertEquals(7,a.max2(3, 7));
	}

}
