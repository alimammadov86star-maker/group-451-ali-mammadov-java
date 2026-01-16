package Classworks;

import java.util.Scanner;

public class Сlasswork2 {
	public static void main(String[] args) {
		// 1
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter your sleeping time");
		byte sleepingTimer = sr.nextByte();
		if (sleepingTimer < 6) {
			System.out.println("Little sleep");
		} else if (sleepingTimer >= 6 && sleepingTimer < 8) {
			System.out.println("Normal");
		} else if (sleepingTimer >= 9 && sleepingTimer < 10) {
			System.out.println("Good");
		} else if (sleepingTimer >= 10 && sleepingTimer < 24) {
			System.out.println("late");
		} else {
			System.out.println("Not correct");
		}

		// 2
		System.out.println("Enter id of fruit 1 - apple, 2 - banana, 3 - orange, 4 - pear, 5 - kiwi");
		byte fruitCode = sr.nextByte();

		switch (fruitCode) {
		case 1:
			System.out.println("Vitamin C and Fiber");
			break;
		case 2:
			System.out.println("Potassium for the Heart");
			break;
		case 3:
			System.out.println("Immunity Boost");
			break;
		case 4:
			System.out.println("Juicy and Refreshing");
			break;
		case 5:
			System.out.println("Exotic with Vitamins");
			break;
		default:
			System.out.println("Fruit not found in the list");
		}
	}
}