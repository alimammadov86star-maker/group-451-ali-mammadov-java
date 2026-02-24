package Classworks.Classwork_7;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		// 1
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();

		if (n == 0) {
			System.out.println("Ноль");
		} else if (n % 2 == 0) {
			System.out.println("Чётное");
		} else {
			System.out.println("Нечётное");
		}

		// 2
		int score = sr.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("Некорректный балл");
		} else if (score >= 90) {
			System.out.println("отлично");
		} else if (score >= 75) {
			System.out.println("хорошо");
		} else if (score >= 60) {
			System.out.println("удовлетворительно");
		} else {
			System.out.println("неудовлетворительно");
		}

		// 3
		double a = sr.nextDouble();
		double b = sr.nextDouble();
		double c = sr.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Треугольник не существует");
		}

		// 4
		double sum = sr.nextDouble();
		double discount = 0;

		if (sum >= 5000)
			discount = 0.15;
		else if (sum >= 2000)
			discount = 0.10;
		else if (sum >= 1000)
			discount = 0.05;

		double total = sum - sum * discount;
		System.out.println("К оплате: " + total);

		// 5
		int h = sr.nextInt();
		int w = sr.nextInt();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 6
		int n1 = sr.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " × " + i + " = " + (n1 * i));
		}

		// 7
		int n2 = sr.nextInt();

		int sum1 = 0;
		int count = 0;

		for (int i = 1; i <= n2; i++) {
			if (i % 2 == 0) {
				sum1 += i;
				count++;
			}
		}

		System.out.println("Сумма: " + sum1);
		System.out.println("Количество: " + count);

		// 8
		int n3 = sr.nextInt();

		if (n > 20) {
			System.out.println("Слишком большое число");
			return;
		}

		long fact = 1;
		for (int i = 1; i <= n3; i++) {
			fact *= i;
		}

		System.out.println("Факториал: " + fact);

		// 9
		Rectangle r1 = new Rectangle(5, 3);
		Rectangle r2 = new Rectangle(7.5, 4);

		r1.printInfo();
		r2.printInfo();

		// 10
		Student[] students = { 
				new Student("Ali", 18, 95), 
				new Student("Ivan", 19, 82), 
				new Student("Leyla", 20, 91) 
		};

		for (Student s : students) {
			if (s.isExcellent()) {
				s.print();
			}
		}
		
		// 11
        Time t = new Time(23, 50);
        t.addMinutes(25);
        System.out.println(t);
        
	}
}