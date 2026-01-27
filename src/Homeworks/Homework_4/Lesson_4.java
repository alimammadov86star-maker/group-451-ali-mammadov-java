package Homeworks.Homework_4;

public class Lesson_4 {
	public static void main(String[] args) {

		// 1
		Student s1 = new Student("Alex", 19, 4.8);
		Student s2 = new Student("John", 21, 4.3);

		s1.printInfo();
		s2.printInfo();

		System.out.println("-----------------");

		// 2
		System.out.println("Sum: " + Calculator.sum(5, 7));

		System.out.println("Average (0): " + Calculator.average());
		System.out.println("Average (1): " + Calculator.average(5));
		System.out.println("Average (3): " + Calculator.average(2, 4, 6));
		System.out.println("Average (5): " + Calculator.average(1, 2, 3, 4, 5));

		Calculator.printMax();
		Calculator.printMax(10);
		Calculator.printMax(3, 7, 2);
		Calculator.printMax(1, 9, 4, 6, 2);

		System.out.println("-----------------");

		// 3
		Printer printer = new Printer();
		printer.print("Hello World");
		printer.print(100);
		printer.print(12.5, "kg");
	}
}