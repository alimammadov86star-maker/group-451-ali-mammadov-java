package Classworks.Classwork_5;

public class Hero {

    private String name;
    private int health;
    private int strength;
    private int level;

    public Hero(String name, int health, int strength, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    public void attack() {
        System.out.println(name + " attacks with strength " + strength);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " takes " + damage + " damage. Remaining HP: " + health);
    }

    public void showInfo() {
        System.out.println("Hero Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Level: " + level);
    }

    public int getStrength() { return strength; }
    public int getHealth() { return health; }
}

