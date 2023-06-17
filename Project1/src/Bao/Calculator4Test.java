package Bao;



import org.junit.jupiter.api.Test;

import NguyenHuu.Calculator4;

class Calculator4Test {
		void test1() {
			Calculator4 a = new Calculator4();
			a.setNumber1(12);
			a.setNumber2(2);
			assertEquals(6,a.div());
		}
		void test2() {
			Calculator4 a = new Calculator4();
			a.setNumber1(12);
			a.setNumber2(0);
			assertEquals("can't solve",a.div());
		}
		void test3() {
			Calculator4 a = new Calculator4();
			a.setNumber1(12);
			a.setNumber2(5);
			assertEquals(2.4,a.div());
		}
		private void assertEquals(double d, int div) {
			// TODO Auto-generated method stub
			
		}
		private void assertEquals(String string, int div) {
			// TODO Auto-generated method stub

	}
}

