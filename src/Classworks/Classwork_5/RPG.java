package Classworks.Classwork_5;

import java.util.Random;

abstract class Character {

    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public abstract int attack();

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) {
        	health = 0;
        	System.out.println(name + " takes " + dmg + " damage. Remaining HP: " + health);
        }
    }

    public boolean isAlive() {
    	return health > 0; 
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Base Damage: " + damage);
        System.out.println("-----------------------");
    }
}

class Warrior extends Character {

    private Random random = new Random();

    public Warrior() {
    	super("Warrior", 120, 20); 
    }

    @Override
    public int attack() {
        int dmg = damage + random.nextInt(10);
        System.out.println("Warrior swings sword! Damage: " + dmg);
        return dmg;
    }
}

class Mage extends Character {

    private int mana = 100;
    private Random random = new Random();

    public Mage() {
    	super("Mage", 80, 25); 
    }

    @Override
    public int attack() {
        if (mana >= 10) {
            mana -= 10;
            int dmg = damage + random.nextInt(15);
            System.out.println("Mage casts fireball! Damage: " + dmg + " | Mana: " + mana);
            return dmg;
        } else {
            System.out.println("Not enough mana! Weak attack!");
            return 5;
        }
    }
}

class Archer extends Character {

    private Random random = new Random();

    public Archer() {
    	super("Archer", 90, 18); 
    }

    @Override
    public int attack() {
        int crit = random.nextInt(100);
        if (crit < 30) {
            int dmg = damage * 2;
            System.out.println("Archer lands CRITICAL hit! Damage: " + dmg);
            return dmg;
        } else {
            int dmg = damage + random.nextInt(8);
            System.out.println("Archer shoots arrow! Damage: " + dmg);
            return dmg;
        }
    }
}

class Enemy {

    private int health = 100;
    private int damage = 15;
    private Random random = new Random();

    public int attack() {
        int dmg = damage + random.nextInt(10);
        System.out.println("Enemy attacks! Damage: " + dmg);
        return dmg;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) health = 0;
        System.out.println("Enemy takes " + dmg + " damage. Remaining HP: " + health);
    }

    public boolean isAlive() {
    	return health > 0; 
    }
}

