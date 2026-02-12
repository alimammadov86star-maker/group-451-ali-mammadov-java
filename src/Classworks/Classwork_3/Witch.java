package Classworks.Classwork_3;

public class Witch extends Monster implements Attackable, Defendable, SpecialAbility {

    private int mana;
    private boolean broom;

    public Witch(String name, int health, double power, int mana, boolean broom) {
        super(name, health, power);
        this.mana = mana;
        this.broom = broom;
    }

    @Override
    public void attack() {
        mana -= 10;
        System.out.println(name + " casts a hex! Mana: " + mana);
    }

    @Override
    public void defend() {
        mana += 15;
        System.out.println(name + " brews potion! Mana: " + mana);
    }

    @Override
    public void useSpecial() {
        if (broom) {
            System.out.println(name + " flies on broom!");
        }
    }

    void hexCast() {
        mana -= 10;
    }

    void potionMix() {
        mana += 15;
    }

    boolean hasFlyingTool() {
        return broom;
    }
}
