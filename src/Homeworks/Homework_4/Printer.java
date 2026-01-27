package Homeworks.Homework_4;

public class Printer {
	public void print(String text) {
		System.out.println("Text: " + text);
	}

	public void print(int number) {
		System.out.println("Number: " + number);
	}

	public void print(double value, final String unit) {
		System.out.println("Value: " + value + " " + unit);
	}
}