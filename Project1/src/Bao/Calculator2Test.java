package Bao;
import org.junit.jupiter.api.Test;

import NguyenHuu.Calculator2;

class Calculator2Test {
	void test() {
		Calculator2 l=new Calculator2();
		l.number1=10;
		l.number2=2;
		l.sub();
	}
	void test1() {
		Calculator2 l=new Calculator2();
		l.number1=2000000000;
		l.number2=1000000000;
		l.sub();
		
	}
	void test2() {
		Calculator2 l=new Calculator2();
		l.number1=-2000000000;
		l.number2=-1000000000;
		l.sub();
	}
}
