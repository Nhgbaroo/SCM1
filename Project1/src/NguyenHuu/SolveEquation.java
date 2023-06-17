package NguyenHuu;

public class SolveEquation {
		private int number1;
		private int number2;
		public SolveEquation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		}
		public String linearEquation() {
		if (number1 == 0)
		if (number2 == 0)
		return "Multi roots";
		else
		return "No root";

		else
		return "One root";

		}
}
