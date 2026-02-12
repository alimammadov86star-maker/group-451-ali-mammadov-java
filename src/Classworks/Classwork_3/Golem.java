package Classworks.Classwork_3;

public class Golem extends Monster implements Attackable, Defendable, SpecialAbility {

    private int defense;
    private String material;

    public Golem(String name, int health, double power, int defense, String material) {
        super(name, health, power);
        this.defense = defense;
        this.material = material;
    }

    @Override
    public void attack() {
        power += 5;
        System.out.println(name + " strikes with heavy fists!");
    }

    @Override
    public void defend() {
        defense += 5;
        System.out.println(name + " hardens its body! Defense: " + defense);
    }

    @Override
    public void useSpecial() {
        loseHealth(10);
        System.out.println(name + " absorbs damage with stone body!");
    }

    void stoneAbsorb(int dmg) {
        loseHealth(dmg / 2);
    }

    void bodyHarden() {
        defense += 5;
    }

    boolean immobile() {
        return true;
    }
}
