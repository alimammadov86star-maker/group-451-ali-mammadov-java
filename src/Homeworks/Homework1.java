package Homeworks;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		// 1
		System.out.println("Please enter your mark");
		byte mark = sr.nextByte();

		if (mark == 5) {
			System.out.println("Excellent");
		} else if (mark == 4) {
			System.out.println("Good");
		} else if (mark == 3) {
			System.out.println("Not bad");
		} else if (mark == 2) {
			System.out.println("Bad");
		} else {
			System.out.println("Not correct grade");
		}

		// 2
		System.out.println("Please enter first number");
		byte a = sr.nextByte();
		System.out.println("Please enter second number");
		byte b = sr.nextByte();
		System.out.println("Please enter third number");
		byte c = sr.nextByte();

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
				System.out.println("Yes");
			}
		} else {
			System.out.println("No");
		}

		// 3
		sr.nextLine();
		System.out.println("Please enter a month");
		String month = sr.nextLine();

		switch (month) {
		case "January":
			System.out.println("31 days");
			break;
		case "February":
			System.out.println("28 days");
			break;
		case "March":
			System.out.println("31 days");
			break;
		case "April":
			System.out.println("30 days");
			break;
		case "May":
			System.out.println("31 days");
			break;
		case "June":
			System.out.println("30 days");
			break;
		case "July":
			System.out.println("31 days");
			break;
		case "August":
			System.out.println("31 days");
			break;
		case "September":
			System.out.println("30 days");
			break;
		case "October":
			System.out.println("31 days");
			break;
		case "November":
			System.out.println("30 days");
			break;
		case "December":
			System.out.println("31 days");
			break;
		default:
			System.out.println("Invalid month");
		}

		// 4
		System.out.println("Please enter your age");
		byte age = sr.nextByte();

		if (age >= 0 && age <= 12) {
			System.out.println("Child");
		} else if (age <= 17) {
			System.out.println("Teenager");
		} else if (age <= 59) {
			System.out.println("Adult");
		} else if (age <= 127) {
			System.out.println("Elderly");
		} else {
			System.out.println("Error");
		}

		// 5
		System.out.println("Please enter first number");
		long firstNum = sr.nextLong();
		System.out.println("Please enter second number");
		long secondNum = sr.nextLong();

		sr.nextLine();
		System.out.println("Please enter operation (+ - * /)");
		String op = sr.nextLine();

		switch (op) {
		case "+":
			System.out.println(firstNum + secondNum);
			break;
		case "-":
			System.out.println(firstNum - secondNum);
			break;
		case "*":
			System.out.println(firstNum * secondNum);
			break;
		case "/":
			if (secondNum != 0) {
				System.out.println(firstNum / secondNum);
			} else {
				System.out.println("You can't devide to zero");
			}

			break;
		default:
			System.out.println("Invalid operation");
		}

		// 6
		System.out.println("Please enter a letter");
		String s1 = sr.nextLine().toLowerCase();

		switch (s1) {
		case "a":
			System.out.println("True");
			break;
		case "e":
			System.out.println("True");
			break;
		case "u":
			System.out.println("True");
			break;
		case "i":
			System.out.println("True");
			break;
		case "y":
			System.out.println("True");
			break;
		default:
			System.out.println("It is not a vowel");
		}

		// 7
		System.out.println("Please enter your points");
		byte point = sr.nextByte();

		if (point >= 90 && point <= 100) {
			System.out.println("5");
		} else if (point >= 75) {
			System.out.println("4");
		} else if (point >= 60) {
			System.out.println("3");
		} else if (point >= 0) {
			System.out.println("2");
		} else {
			System.out.println("Error");
		}

		// 8
		System.out.println("Enter day of the week (1-7)");
		byte day = sr.nextByte();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
		}

		// 9
		System.out.println("Enter first side");
		byte a1 = sr.nextByte();
		System.out.println("Enter second side");
		byte b2 = sr.nextByte();
		System.out.println("Enter third side");
		byte c3 = sr.nextByte();
		if (a1 == b2 && b2 == c3) {
			System.out.println("Equilateral");
		} else if (a1 == b2 || a1 == c3 || b2 == c3) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}

		// 10
		System.out.println("Please enter a year");
		short year = sr.nextShort();

		if (year < 0) {
			System.out.println("Error");
		} else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Ordinary year");
		}
	}
}