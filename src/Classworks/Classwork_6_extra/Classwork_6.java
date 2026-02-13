package Classworks.Classwork_6_extra;

import java.util.Random;
import java.util.Scanner;

// 1
class Wizard {
    // 2-3
    private String name;
    private int health;
    private int mana;
    private int level;

    // 18
    public static int wizardCount = 0;

    private Random random = new Random();

    // 4
    public Wizard(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.level = 1;
        wizardCount++;
    }

    // 5
    public void showInfo() {
        System.out.println(this);
    }

    // 6
    public int attack() {
        if (mana < 10) {
            System.out.println(name + " does not have enough mana!");
            return 0;
        }
        mana -= 10;
        int damage = 10 + random.nextInt(16);
        System.out.println(name + " attacks and deals " + damage + " damage!");
        return damage;
    }

    // 7-8
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage! Health: " + health);
        if (health <= 0) {
            System.out.println("Wizard " + name + " has been defeated!");
        }
    }

    // 9
    public void heal() {
        if (mana < 15) {
            System.out.println(name + " does not have enough mana to heal!");
            return;
        }
        mana -= 15;
        health += 20;
        System.out.println(name + " heals 20 health! Health: " + health);
    }

    // 17
    public void levelUp() {
        level++;
        health += 20;
        System.out.println(name + " leveled up! Level: " + level + ", Health: " + health);
    }

    // 19
    @Override
    public String toString() {
        return "Wizard{name='" + name + "', health=" + health + ", mana=" + mana + ", level=" + level + "}";
    }

    public int getHealth() {
        return health;
    }
}

// 10
class Monster {
    private String type;
    private int health;
    private int damage;

    private Random random = new Random();

    // 11
    public Monster(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    // 12
    public void attack(Wizard wizard) {
        int dealtDamage = 10 + random.nextInt(16);
        System.out.println(type + " attacks and deals " + dealtDamage + " damage!");
        wizard.takeDamage(dealtDamage);
    }

    // 13
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(type + " takes " + damage + " damage! Health: " + health);
        if (health <= 0) {
            System.out.println("Monster " + type + " has been defeated!");
        }
    }

    public int getHealth() {
        return health;
    }
}

// 14-20
public class Classwork_6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        // 14
        Wizard wizard = new Wizard("Wizard1", 100, 100);
        Monster monster = new Monster("Goblin", 80, 15);

        System.out.println("Battle starts!");
        wizard.showInfo();

        // 15 - 16 
        while (wizard.getHealth() > 0 && monster.getHealth() > 0) {
            // 20
            System.out.println("Choose action: 1 — Attack, 2 — Heal");
            int choice = sr.nextInt();

            if (choice == 1) {
                int damage = wizard.attack();
                monster.takeDamage(damage);
            } else if (choice == 2) {
                wizard.heal();
            } else {
                System.out.println("Invalid choice! Turn skipped.");
            }

            if (monster.getHealth() > 0) {
                monster.attack(wizard);
            }
        }

        // 17
        if (wizard.getHealth() > 0) {
            wizard.levelUp();
        }

        // 18
        System.out.println("Total wizards created: " + Wizard.wizardCount);
        System.out.println("Battle ended.");

        sr.close();
    }
}
