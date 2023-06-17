package Bao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import NguyenHuu.MaxNumber1;

class MaxNumber1Test {

	@Test
	void test1() {
		MaxNumber1 a = new MaxNumber1();
		assertEquals(10,a.max3(9, 10, 2));
	}
	@Test
	void test2() {
		MaxNumber1 a = new MaxNumber1();
		assertEquals(7,a.max3(5, 4, 7));
	}
	@Test
	void test3() {
		MaxNumber1 a = new MaxNumber1();
		assertEquals(7,a.max3(2, 3, 7));
	}

}
