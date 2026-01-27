package Homeworks.Homework_5;

public class Counter {
	static int totalCount = 0;
	int instanceCount = 0;

	Counter() {
		totalCount++;
		instanceCount++;
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		System.out.println(c1.totalCount + c1.instanceCount);
		System.out.println(c2.totalCount + c2.instanceCount);
		System.out.println(c3.totalCount + c3.instanceCount);
	}
}