package Classworks;

import java.util.Scanner;

public class Classwork_1 {
	public static void main(String[] args) {

		// 1
		Scanner sr = new Scanner(System.in);

		System.out.println("Please enter your age");
		byte age = sr.nextByte();
		if (age >= 18) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are a child");
		}

		// 2
		System.out.println("Enter a your number");
		byte num = sr.nextByte();
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

		// 3
		System.out.println("Enter a your grade");
		byte grade = sr.nextByte();
		if (grade == 5) {
			System.out.println("Exelent");
		} else if (grade == 4) {
			System.out.println("Good");
		} else if (grade == 3) {
			System.out.println("Not bad");
		} else {
			System.out.println("Bad");
		}

		// 4
		byte temprature = 19;
		if (temprature > 25) {
			System.out.println("Hot");
		} else if (temprature > 10 && temprature < 25) {
			System.out.println("Warm");
		} else {
			System.out.println("Cold");
		}

		// 5
		byte dayOfweek = 3;
		switch (dayOfweek) {
			case 1:
				System.out.println("Monday");
			case 2:
				System.out.println("Tuesday");
			case 3:
				System.out.println("Wednesday");
			case 4:
				System.out.println("Thursday");
			case 5:
				System.out.println("Friday");
			case 6:
				System.out.println("Saturday");
			case 7:
				System.out.println("Sunday");
			default:
				System.out.println("Not correct day of week");
		}

		// 6
		sr.nextLine();
		System.out.println("Enter a your grade");
		String gradeStr = sr.nextLine();
		if (gradeStr == "A") {
			System.out.println("Exelent");
		} else if (gradeStr == "B") {
			System.out.println("Good");
		} else if (gradeStr == "C") {
			System.out.println("Not bad");
		} else if (gradeStr == "D") {
			System.out.println("Bad");
		} else {
			System.out.println("Bad bad bad");
		}

		// 7
		byte a = 20;
		byte b = 45;
		if (a > b) {
			System.out.println("A bigger than B");
		} else if (b > a) {
			System.out.println("B bigger than A");
		} else {
			System.out.println("B equals to A");
		}

		// 8
		byte time = 20;
		if (time > 6 && time < 11) {
			System.out.println("Morning");
		} else if (time > 12 && time < 17) {
			System.out.println("Noon");
		} else if (time > 18 && time < 22) {
			System.out.println("Evening");
		} else {
			System.out.println("Night");
		}

		// 9
		byte year = 4;
		switch (year) {
			case 12, 1, 2:
				System.out.println("winter");
			case 3, 4, 5:
				System.out.println("spring");
			case 6, 7, 8:
				System.out.println("summer");
			case 9, 10, 11:
				System.out.println("fall");
		}

		// 10
		byte num2 = 40;
		if (num2 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		// 11
		String v1 = "M";
		if (v1 == "M") {
			System.out.println("Hi, male");
		} else if (v1 == "F") {
			System.out.println("Hi, female");
		}

		// 12
		byte point = 91;
		if (point >= 90) {
			System.out.println("5");
		} else if (point > 75 && point < 89) {
			System.out.println("4");
		} else if (point > 75 && point < 50) {
			System.out.println("3");
		} else {
			System.out.println("2");
		}

		// 13
		String color = "yellow";
		switch (color) {
			case "green":
				System.out.println("You can go");
			case "yellow":
				System.out.println("wait 5 seconds");
			case "red":
				System.out.println("You cant't go");
		}

		// 14
		byte age1 = 5;
		if (age1 < 7) {
			System.out.println("Детский сад");
		} else if (age1 > 7 && age1 < 17) {
			System.out.println("Школа");
		} else {
			System.out.println("Adult");
		}

		// 15
		byte season = 1;
		switch (season) {
			case 1:
				System.out.println("Winter");
			case 2:
				System.out.println("Spring");
			case 3:
				System.out.println("Summer");
			case 4:
				System.out.println("Fall");
		}

		// 16
		short height = 100;
		if (height < 150) {
			System.out.println("Низкий");
		} else if (height > 150 && height < 180) {
			System.out.println("Средний");
		} else {
			System.out.println("Высокий");
		}

		// 17
		short pointsInGame = 400;
		if (pointsInGame > 100) {
			System.out.println("winner");
		} else {
			System.out.println("Try again");
		}

		// 18
		String op = "+";
		switch (op) {
			case "+":
				System.out.println("plus");
			case "-":
				System.out.println("minus");
			case "*":
				System.out.println("time");
			case "/":
				System.out.println("division");
		}

		// 19
		byte myfavoritenum = 3;
		byte mymind = 2;
		if (myfavoritenum == mymind) {
			System.out.println("You are a genious");
		}

		// 20
		byte a1 = 20;
		byte b1 = 45;
		if (a1 == b1) {
			System.out.println("A equals to B");
		} else {
			System.out.println("B not equals to A");
		}

		// 21
		byte temprature1 = 126;
		if (temprature1 < 0) {
			System.out.println("Ice");
		} else if (temprature1 > 0 && temprature1 < 99) {
			System.out.println("Water");
		} else {
			System.out.println("par");
		}

		// 22
		byte animals = 4;
		if (animals == 0) {
			System.out.println("0 animal");
		} else if (animals == 1) {
			System.out.println("1 animal");
		} else {
			System.out.println("more animals");
		}

		// 23
		byte mark = 4;
		if (mark < 4) {
			System.out.println("I'll talk");
		} else {
			System.out.println("Good");
		}

		// 24
		byte planet = 4;
		switch (planet) {
			case 1:
				System.out.println("Mercury");
			case 2:
				System.out.println("Venus");
			case 3:
				System.out.println("Earth");
			case 4:
				System.out.println("Mars");
			case 5:
				System.out.println("Jupiter");
			case 6:
				System.out.println("Saturn");
			case 7:
				System.out.println("Uranus");
			case 8:
				System.out.println("Neptune");
		}
	}
}
