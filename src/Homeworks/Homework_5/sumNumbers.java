package Homeworks.Homework_5;

public class sumNumbers {

	public static double sumNumbers(Integer a, double b) {

		return a + b;
	}

	public static void main(String[] args) {
		double r1 = sumNumbers(5, 2.5);
		double r2 = sumNumbers(10, 3.14);
		double r3 = sumNumbers(null, 4.0);

		System.out.println(r1);
		System.out.println(r2);
	}
}
