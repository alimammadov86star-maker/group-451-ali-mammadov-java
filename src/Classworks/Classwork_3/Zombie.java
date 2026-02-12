package Classworks.Classwork_3;


public class Zombie extends Monster
        implements Attackable, Defendable, SpecialAbility {

    int rotLevel;
    boolean hasBrain;

    public Zombie(String name, int health, double power, int rotLevel, boolean hasBrain) {
        super(name, health, power);
        this.rotLevel = rotLevel;
        this.hasBrain = hasBrain;
    }


    @Override
    public void attack() {

        power += 2;
        rotLevel++;
        System.out.println(name + " virus: " + rotLevel);
    }

    @Override
    public void defend() {

        loseHealth(2);
        System.out.println(name + " coming");
    }

    @Override
    public void useSpecial() {

        if (hasBrain) {
            health += 5;
            System.out.println(name + " he is so smart Health: " + health);
        } else {
            System.out.println(name + " not smart");
        }
    }


    void spreadVirus() {
        rotLevel++;
    }

    void limbFall() {
        loseHealth(5);
    }

    boolean regenerateFlesh() {

        health += 3;
        return true;
    }
}
