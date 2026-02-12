package Classworks;

public class Classwork3 {
	public static void main(String[] args) {

		int height = 8;

		for (int i = 0; i < height; i++) {

			for (int s = height - i; s > 0; s--) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				if (j % 3 == 1) {
					System.out.print("o");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int s = 0; s < height; s++) {
				System.out.print(" ");
			}
			System.out.println("|||");
		}

		for (int i = 0; i < height; i++) {
			System.out.print("=");
		}
	}
}