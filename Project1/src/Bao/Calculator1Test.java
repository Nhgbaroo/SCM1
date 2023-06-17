package Bao;

import org.junit.jupiter.api.Test;

import NguyenHuu.Calculator1;

class Calculator1Test {

	void test1() {
		Calculator1 a = new Calculator1();
		assertEquals(7,a.add(2, 5));
	}
	void test2() {
		Calculator1 a = new Calculator1();
		assertEquals(3000000000.0,a.add(1000000000, 2000000000));
	}
	void test3() {
		Calculator1 a = new Calculator1();
		assertEquals(-3000000000.0,a.add(-1000000000, -2000000000));
	}
	private void assertEquals(double d, int add) {
		// TODO Auto-generated method stub
		
	}

}
