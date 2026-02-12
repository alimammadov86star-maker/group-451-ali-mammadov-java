package Classworks.Classwork_3;

public class Creeper extends Monster implements Attackable, Defendable, SpecialAbility {

    boolean charged;
    int fuseTime;

    public Creeper(String name, int health, double power, boolean charged, int fuseTime) {
        super(name, health, power);
        this.charged = charged;
        this.fuseTime = fuseTime;
    }

    @Override
    public void attack() {
        fuseTime--;
        System.out.println(name + " is priming! Fuse time left: " + fuseTime);
    }

    @Override
    public void defend() {
        if (!isAlive()) return;
        loseHealth(2);
        System.out.println(name + " takes minimal damage while priming");
    }

    @Override
    public void useSpecial() {
        health = 0;
        alive = false;
        System.out.println(name + " detonates!");
    }

    void prime() {
        fuseTime--;
    }

    boolean isCharged() {
        return charged;
    }
}
