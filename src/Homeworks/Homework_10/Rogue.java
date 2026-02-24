package Homeworks.Homework_10;

public class Rogue implements Fighter {

    int health = 80;

    public int attack() {
        if (Math.random() < 0.25)
            return 30;
        return 12;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
