package Bao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import NguyenHuu.SolveEquation;

class SolveEquationTest {

	@Test
	void test1() {
		SolveEquation a = new SolveEquation();
		a.number1=0;
		a.number2=0;
		assertEquals("Multi roots",a.linearEquation());
	}
	@Test
	void test2() {
		SolveEquation a = new SolveEquation();
		a.number1=0;
		a.number2=2;
		assertEquals("No root",a.linearEquation());
	}
	@Test
	void test3() {
		SolveEquation a = new SolveEquation();
		a.number1=4;
		a.number2=3;
		assertEquals("One root",a.linearEquation());
	}

}


}
