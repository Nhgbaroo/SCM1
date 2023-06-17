package REFACTOR;

public class print {
	public static void printStartAndEnd() {
		System.out.println("*****************");
	}
	public static void printStart() {
		printStartAndEnd();
		System.out.println("******START******");
		printStartAndEnd();
		}
		public static void printEnd() {
		printStartAndEnd();
		System.out.println("*******END*******");
		printStartAndEnd();
		}
		public static void main(String[] args) {
		// int i;
		printStart();
		System.out.println("THE MAIN FUNCTION");
		printEnd();
		//Close the variable
		}
}
