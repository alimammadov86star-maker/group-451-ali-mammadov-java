package Homeworks.Homework_10;

public class Knight implements Fighter {

    int health = 100;
    int armor = 5;

    public int attack() {
        return 15;
    }

    public void takeDamage(int dmg) {
        health -= (dmg - armor);
    }

    public boolean isAlive() {
        return health > 0;
    }
}
