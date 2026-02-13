package Classworks.Classwork_5;

import java.util.Scanner;
import java.util.Random;

public class Classwork_5 {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        Random random = new Random();

        // 1
        Hero hero1 = new Hero("Arthur", 100, 20, 1);
        Hero hero2 = new Hero("Lancelot", 90, 25, 1);

        hero1.showInfo();
        hero2.showInfo();

        hero1.attack();
        hero2.takeDamage(hero1.getStrength());

        hero2.attack();
        hero1.takeDamage(hero2.getStrength());

        // 2
        Hero hero = new Hero("Knight", 100, 20, 1);
        Monster monster = new FireMonster();
        monster.specialAbility();

        while (hero.getHealth() > 0 && monster.isAlive()) {
            hero.attack();
            monster.takeDamage(hero.getStrength());

            if (monster.isAlive()) {
                monster.attack();
            }
        }
        System.out.println("Monster battle finished!");

        // 3
        BankAccount acc1 = new BankAccount("Ali", 500);
        BankAccount acc2 = new BankAccount("Sara", 300);

        acc1.deposit(200);
        acc1.withdraw(100);
        acc1.transfer(acc2, 250);

        acc1.showBalance();
        acc2.showBalance();

        // 4
        Car car1 = new Car("BMW", 220, 50);
        Car car2 = new Car("Audi", 210, 60);
        Car car3 = new Car("Mercedes", 230, 40);

        car1.drive();
        car2.drive();
        car3.drive();

        Car fastest = car1;
        if (car2.getSpeed() > fastest.getSpeed()) fastest = car2;
        if (car3.getSpeed() > fastest.getSpeed()) fastest = car3;

        System.out.println("Fastest car: " + fastest.getBrand() + " Speed: " + fastest.getSpeed());

        // 5
        Student s1 = new Student("Ali", 15, 85);
        Student s2 = new Student("Sara", 16, 92);
        Student s3 = new Student("John", 15, 78);
        Student s4 = new Student("Emma", 16, 88);
        Student s5 = new Student("David", 15, 95);

        Student[] students = {s1, s2, s3, s4, s5};
        double sum = 0;
        Student best = students[0];
        for (Student s : students) {
            sum += s.grade;
            if (s.grade > best.grade) best = s;
        }
        System.out.println("Best student: " + best.name);
        System.out.println("Average grade: " + (sum / students.length));

        // 6
        System.out.println("Choose your character:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Archer");

        
        int choice = sr.nextInt();
        Character player;
        switch (choice) {
            case 1:
            	player = new Warrior();
            	break;
            case 2:
            	player = new Mage();
            	break;
            case 3:
            	player = new Archer();
            	break;
            default:
            	player = new Warrior();
            	break;
        }

        Enemy enemy = new Enemy();
        player.showInfo();

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n1 - Attack");
            System.out.println("2 - Skip Turn");
            int action = sr.nextInt();

            if (action == 1) {
                int dmg = player.attack();
                enemy.takeDamage(dmg);
            }

            if (enemy.isAlive()) {
                int dmg = enemy.attack();
                player.takeDamage(dmg);
            }
        }

        if (player.isAlive()) System.out.println("YOU WIN!");
        else System.out.println("YOU LOST!");

        sr.close();
    }
}
