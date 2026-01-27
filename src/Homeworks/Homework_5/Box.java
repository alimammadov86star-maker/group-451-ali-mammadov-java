package Homeworks.Homework_5;

public class Box {
	int value;

	Box(int value) {
		this.value = value;
	}

	static void changeValue(Box b) {
		b.value = 100;
	}

	public static void main(String[] args) {
		Box box = new Box(10);

		changeValue(box);

		System.out.println(box.value);
	}
}
