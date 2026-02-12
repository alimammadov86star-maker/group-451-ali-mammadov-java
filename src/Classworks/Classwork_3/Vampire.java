package Classworks.Classwork_3;

public class Vampire extends Monster implements Attackable, Defendable, SpecialAbility {

    private int blood;
    private boolean nightForm;

    public Vampire(String name, int health, double power, int blood, boolean nightForm) {
        super(name, health, power);
        this.blood = blood;
        this.nightForm = nightForm;
    }

    @Override
    public void attack() {
        blood += 10;
        health += 5;
        System.out.println(name + " bites and drains blood! Blood: " + blood);
    }

    @Override
    public void defend() {
        health += 5;
        System.out.println(name + " evades damage in night form");
    }

    @Override
    public void useSpecial() {
        nightForm = true;
        System.out.println(name + " transforms into bat!");
    }

    void bloodDrain() {
        blood += 10;
        health += 10;
    }

    void batShift() {
        nightForm = true;
    }

    boolean sunWeakness() {
        return !nightForm;
    }
}
