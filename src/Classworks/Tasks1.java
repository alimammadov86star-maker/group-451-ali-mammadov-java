package Classworks;

import java.util.Scanner;
import java.util.Random;

public class Tasks1 {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        System.out.println("Choose a task:");
        System.out.println("1 - Even or Odd");
        System.out.println("2 - Sum from 1 to N");
        System.out.println("3 - Multiplication Table");
        System.out.println("4 - Find the Largest Number");
        System.out.println("5 - Guess the Number Game");

        int choice = sr.nextInt();

        if (choice == 1) {

            System.out.print("Enter a number: ");
            int num = sr.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }

        } else if (choice == 2) {

            System.out.print("Enter number N: ");
            int n = sr.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum = " + sum);

        } else if (choice == 3) {

            System.out.print("Enter a number: ");
            int num = sr.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

        } else if (choice == 4) {

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter a number: ");
                int num = sr.nextInt();

                if (num > max) {
                    max = num;
                }
            }

            System.out.println("The largest number is: " + max);

        } else if (choice == 5) {

            Random rand = new Random();
            int secret = rand.nextInt(100) + 1;
            int guess = 0;

            while (guess != secret) {

                System.out.print("Guess the number (1-100): ");
                guess = sr.nextInt();

                if (guess > secret) {
                    System.out.println("Lower");
                } else if (guess < secret) {
                    System.out.println("Higher");
                } else {
                    System.out.println("You guessed it!");
                }
            }

        } else {
            System.out.println("Invalid choice");
        }
    }
}