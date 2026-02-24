package Homeworks.Homework_10;

public class Necromancer implements Fighter {

    int health = 70;
    boolean usedSummon = false;

    public int attack() {
        int dmg = 10;
        if (!usedSummon) {
            dmg += 10;
            usedSummon = true;
        }
        return dmg;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
