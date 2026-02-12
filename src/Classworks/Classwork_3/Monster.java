package Classworks.Classwork_3;

public class Monster {

    protected String name;
    protected int health;
    protected double power;
    protected boolean alive;

    public Monster(String name, int health, double power) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.alive = true;
    }

    protected void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            alive = false;
        }
    }

    protected boolean isAlive() {
        return alive;
    }
}
