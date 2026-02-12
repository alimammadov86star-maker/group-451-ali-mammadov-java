package Classworks.Classwork_3;

public class Warden extends Monster implements Attackable, Defendable, SpecialAbility {

    private int rage;
    private double soundSense;

    public Warden(String name, int health, double power, int rage, double soundSense) {
        super(name, health, power);
        this.rage = rage;
        this.soundSense = soundSense;
    }

    @Override
    public void attack() {
        rage += 10;
        System.out.println(name + " uses sonic blast! Rage: " + rage);
    }

    @Override
    public void defend() {
        power += soundSense;
        System.out.println(name + " scans vibrations! Power: " + power);
    }

    @Override
    public void useSpecial() {
        rage += 20;
        System.out.println(name + " enters berserk mode!");
    }

    void sonicBlast() {
        rage += 10;
    }

    void vibrationScan() {
        power += soundSense;
    }

    boolean berserkMode() {
        return rage > 30;
    }
}
