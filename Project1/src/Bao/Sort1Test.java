package Bao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import NguyenHuu.Sort1;
class Sort1Test {

	@Test
	void test1() {
		Sort1 a = new Sort1();
		a.setNumber1(6);
		a.setNumber2(9);
		a.sortAsc();
		assertTrue(a.getNumber1()==6 && a.getNumber2()==9);
	}
	@Test
	void test2() {
		Sort1 a = new Sort1();
		a.setNumber1(7);
		a.setNumber2(5);
		a.sortAsc();
		assertTrue(a.getNumber1()==7 && a.getNumber2()==5);
	}

}


