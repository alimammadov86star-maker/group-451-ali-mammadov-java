package Classworks;

import java.util.Scanner;

public class Classwork4 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		// 1
		System.out.print("Введите число: ");
		int num1 = sr.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("Чётное");
		} else {
			System.out.println("Нечётное");
		}

		System.out.println();

		// 2
		System.out.print("Введите число: ");
		int num2 = sr.nextInt();

		if (num2 > 0) {
			System.out.println("Положительное");
		} else if (num2 < 0) {
			System.out.println("Отрицательное");
		} else {
			System.out.println("Ноль");
		}

		System.out.println();

		// 3
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + (5 * i));
		}

		System.out.println();

		// 4
		int sum100 = 0;
		for (int i = 1; i <= 100; i++) {
			sum100 += i;
		}

		System.out.println("Сумма: " + sum100);
		System.out.println();

		// 5
		int secret = 7;
		int guess = 0;

		while (guess != secret) {
			System.out.print("Введите число: ");
			guess = sr.nextInt();

			if (guess > secret) {
				System.out.println("Меньше");
			} else if (guess < secret) {
				System.out.println("Больше");
			} else {
				System.out.println("Угадал!");
			}
		}

		System.out.println();

		// 6
		int evenCount = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Введите число: ");
			int n = sr.nextInt();

			if (n % 2 == 0) {
				evenCount++;
			}
		}

		System.out.println("Чётных чисел: " + evenCount);
		System.out.println();

		// 7
		System.out.print("Введите число: ");
		int factNum = sr.nextInt();

		int factorial = 1;

		for (int i = 1; i <= factNum; i++) {
			factorial *= i;
		}

		System.out.println(factNum + "! = " + factorial);
		System.out.println();

		// 8
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Введите число: ");
			int n = sr.nextInt();

			if (n > max) {
				max = n;
			}
		}

		System.out.println("Максимум: " + max);
		System.out.println();

		// 9
		System.out.print("Введите высоту: ");
		int height = sr.nextInt();

		System.out.print("Введите ширину: ");
		int width = sr.nextInt();

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 10
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 11
		System.out.print("Введите N: ");
		int N = sr.nextInt();

		int evenSum = 0;

		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}

		System.out.println("Сумма чётных: " + evenSum);
		System.out.println();

		// 12
		sr.nextLine();

		String password = "";

		while (!password.equals("java123")) {
			System.out.print("Введите пароль: ");
			password = sr.nextLine();
		}

		System.out.println("Доступ разрешён!");

        // 13
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();


        // 14
        int sumOdd = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println("Сумма нечётных: " + sumOdd);

        System.out.println();


        // 15
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println();


        // 16
        System.out.print("Введите число: ");
        int number = sr.nextInt();
        int digits = 0;

        int temp = Math.abs(number);

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
        }

        System.out.println("Количество цифр: " + digits);

        System.out.println();


        // 17
        System.out.print("Введите возраст: ");
        int age = sr.nextInt();

        if (age <= 12) {
            System.out.println("Ребёнок");
        } else if (age <= 17) {
            System.out.println("Подросток");
        } else {
            System.out.println("Взрослый");
        }

        System.out.println();


        // 18
        int sum = 0;
        int input;

        do {
            System.out.print("Введите число (0 для выхода): ");
            input = sr.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("Сумма: " + sum);

        System.out.println();


        // 19
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Введите число: ");
            int n = sr.nextInt();

            if (n < min) {
                min = n;
            }
        }

        System.out.println("Минимум: " + min);

        System.out.println();


        // 20
        System.out.print("Введите N: ");
        int nSquare = sr.nextInt();

        for (int i = 1; i <= nSquare; i++) {
            System.out.println(i + " -> " + (i * i));
        }

        System.out.println();


        // 21
        System.out.print("Введите число: ");
        int primeNum = sr.nextInt();

        boolean isPrime = true;

        if (primeNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= primeNum / 2; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Простое");
        } else {
            System.out.println("Не простое");
        }

        System.out.println();


        // 22
        int heightTree = 4;

        for (int i = 1; i <= heightTree; i++) {

            for (int space = 1; space <= heightTree - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
            
            sr.close();
        }
	}
}