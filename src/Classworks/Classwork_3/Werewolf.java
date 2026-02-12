package Classworks.Classwork_3;

public class Werewolf extends Monster implements Attackable, Defendable, SpecialAbility {

    private int rage;
    private boolean fullMoon;

    public Werewolf(String name, int health, double power, int rage, boolean fullMoon) {
        super(name, health, power);
        this.rage = rage;
        this.fullMoon = fullMoon;
    }

    @Override
    public void attack() {
        power += 3;
        System.out.println(name + " strikes with claws! Power: " + power);
    }

    @Override
    public void defend() {
        health += 5;
        System.out.println(name + " resists damage! Health: " + health);
    }

    @Override
    public void useSpecial() {
        if (fullMoon) {
            rage += 20;
            System.out.println(name + " transforms under the full moon! Rage: " + rage);
        }
    }

    void moonTransform() {
        if (fullMoon) rage += 20;
    }

    boolean frenzy() {
        return rage > 25;
    }
}
