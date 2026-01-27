package Homeworks.Homework_5;

public class ScopeText {

	static void testScopes() {
		int x = 10;

		if (x > 5) {
			int y = x * 2;
			System.out.println("y = " + y);
		}

		System.out.println("x = " + x);
//		System.out.println("y = " + y); // error is there <-
	}
}