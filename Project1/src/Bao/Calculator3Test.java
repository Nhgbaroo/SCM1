package Bao;
import org.junit.jupiter.api.Test;

import NguyenHuu.Calculator3;

class Calculator3Test {
	void test() {
		Calculator3 k = new Calculator3(2,5);
		k.mul();
	}
	void test1() {
		Calculator3 k = new Calculator3(1000000000,4);
		k.mul();
	}
	void test2() {
		Calculator3 k = new Calculator3(-2000000000,2);
		k.mul();
	}
}
