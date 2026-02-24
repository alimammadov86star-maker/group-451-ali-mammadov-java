package Classworks.Classwork_8;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		// 1
		int day = sr.nextInt();

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Будний день");
			break;
		case 6:
		case 7:
			System.out.println("Выходной");
			break;
		default:
			System.out.println("Некорректный день");
		}

		// 2
		int age = sr.nextInt();

		if (age < 0)
			System.out.println("Возраст не может быть отрицательным");
		else if (age <= 2)
			System.out.println("младенец");
		else if (age <= 6)
			System.out.println("дошкольник");
		else if (age <= 10)
			System.out.println("младший школьник");
		else if (age <= 14)
			System.out.println("подросток младший");
		else if (age <= 17)
			System.out.println("подросток старший");
		else if (age <= 64)
			System.out.println("взрослый");
		else
			System.out.println("пожилой человек");

		// 3
		String password = sr.nextLine();

		boolean hasLength = password.length() >= 8;
		boolean hasUpper = false;
		boolean hasDigit = false;
		boolean hasSpecial = false;
		String specials = "!@#$%^&*";

		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c))
				hasUpper = true;
			if (Character.isDigit(c))
				hasDigit = true;
			if (specials.contains(String.valueOf(c)))
				hasSpecial = true;
		}

		int score = 0;

		if (!hasLength)
			System.out.println("Пароль короче 8 символов");
		else
			score++;

		if (!hasUpper)
			System.out.println("Нет заглавной буквы");
		else
			score++;

		if (!hasDigit)
			System.out.println("Нет цифры");
		else
			score++;

		if (!hasSpecial)
			System.out.println("Нет спецсимвола");
		else
			score++;

		if (score == 4)
			System.out.println("Сильный пароль");
		else if (score == 3)
			System.out.println("Средний пароль");
		else
			System.out.println("Слабый пароль");

		// 4
		double a = sr.nextDouble();
		double b = sr.nextDouble();
		char op = sr.next().charAt(0);

		switch (op) {
		case '+':
			System.out.println("Result: " + (a + b));
			break;
		case '-':
			System.out.println("Resut: " + (a - b));
			break;
		case '*':
			System.out.println("Result: " + (a * b));
			break;
		case '/':
			if (b == 0) {
				System.out.println("Деление на ноль запрещено");
			} else {
				System.out.println("Result: " + (a / b));
			}
			break;
		case '%':
			if (b == 0)
				System.out.println("Деление на ноль запрещено");
			else
				System.out.println("Result: " + (a % b));
			break;
		default:
			System.out.println("Операция не поддерживается");
		}

		// 5
		int n = sr.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int s = 0; s < n - i; s++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			for (int j = i - 1; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}

		// 6
		int secret = (int) (Math.random() * 100) + 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Number: ");
			int guess = sr.nextInt();

			if (guess == secret) {
				System.out.println("Угадал за " + i + " попыток!");
				break;
			} else if (guess < secret)
				System.out.println("Слишком мало");
			else
				System.out.println("Слишком много");

			if (i == 10)
				System.out.println("Вы проиграли. Число было: " + secret);
		}

		// 7
		long num = sr.nextLong();

		int sum = 0, even = 0, odd = 0;

		while (num > 0) {
			int digit = (int) (num % 10);
			sum += digit;
			if (digit % 2 == 0)
				even++;
			else
				odd++;
			num /= 10;
		}

		System.out.println("Sum: " + sum);
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

		// 8
		int h = sr.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int s = 0; s < h - i; s++)
				System.out.print(" ");
			for (int star = 0; star < 2 * i - 1; star++)
				System.out.print("*");
			System.out.println();
		}

		// 10

		Car c1 = new Car("Toyota", 2020, 40);
		Car c2 = new Car("BMW", 2022, 10);

		System.out.println(c1.status());
		c1.startEngine();
		c1.refuel(20);
		c1.stopEngine();
		System.out.println(c1.status());

		System.out.println();

		System.out.println(c2.status());
		c2.startEngine();
		c2.refuel(50);
		System.out.println(c2.status());

		// 11
		BankAccount b1 = new BankAccount("ACC1001", 1000, 0.5);

		b1.deposit(500);
		b1.withdraw(200);
		b1.applyMonthlyInterest();

		System.out.println("Balance: " + b1.balance);

		b1.withdraw(5000);

		// 12

		GuessGame g1 = new GuessGame(1, 50, 5);

		System.out.println("Guess the number (1-50). You have 5 attempts.");

		while (!g1.isGameOver()) {
			System.out.print("Enter number: ");
			int guess = sr.nextInt();

			boolean correct = g1.makeGuess(guess);

			System.out.println(g1.getHint(guess));

			if (correct) {
				System.out.println("You win!");
				break;
			}
		}
	}
}