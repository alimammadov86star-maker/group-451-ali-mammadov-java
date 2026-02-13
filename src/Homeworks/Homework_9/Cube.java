package Homeworks.Homework_9;

import java.util.Random;

public class Cube {

    public static int rollCube() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {

        int totalPoints = 0;
        int numberOfRolls = 15;

        System.out.println("The game starts!");

        for (int i = 1; i <= numberOfRolls; i++) {

            int points = rollCube();

            System.out.println("Roll " + i + ": " + points);

            totalPoints += points;

            if (points == 1) {
                System.out.println("Very bad...");
            }

            if (points == 6) {
                System.out.println("Awesome! Six!");
            }
        }

        System.out.println("Total points scored: " + totalPoints);
    }
}
