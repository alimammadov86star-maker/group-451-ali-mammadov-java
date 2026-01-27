package Homeworks.Homework_5;

public class Lesson_5 {
	public static void main(String[] args) {

		// 1
		Person p1 = new Person("Alex");
		p1.printNameLength();

		Person p2 = new Person(null);
		p2.printNameLength();

		// 2
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		System.out.println(c1.totalCount + c1.instanceCount);
		System.out.println(c2.totalCount + c2.instanceCount);
		System.out.println(c3.totalCount + c3.instanceCount);

		// 3 
		double r1 = sumNumbers.sumNumbers(5, 2.5);
		double r2 = sumNumbers.sumNumbers(10, 3.14);
		System.out.println(r1);
		System.out.println(r2);

		// 4
		Box box = new Box(10);
		Box.changeValue(box);
		System.out.println("Box value after changeValue: " + box.value);
	}
}