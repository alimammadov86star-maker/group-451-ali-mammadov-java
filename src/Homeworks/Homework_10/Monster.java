package Homeworks.Homework_10;

public class Monster {

    int health;

    public Monster(int health) {
        this.health = health;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
    }

    public int attack() {
        return (int)(Math.random() * 15) + 5;
    }

    public boolean isAlive() {
        return health > 0;
    }
}

