package Classworks.Classwork_3;

public class Enderman extends Monster implements Attackable, Defendable, SpecialAbility {

    private boolean aggressive;
    private int blocks;

    public Enderman(String name, int health, double power, boolean aggressive, int blocks) {
        super(name, health, power);
        this.aggressive = aggressive;
        this.blocks = blocks;
    }

    @Override
    public void attack() {
        power += 7;
        System.out.println(name + " warps and attacks! Power: " + power);
    }

    @Override
    public void defend() {
        blocks++;
        System.out.println(name + " teleports away! Blocks carried: " + blocks);
    }

    @Override
    public void useSpecial() {
        aggressive = true;
        System.out.println(name + " becomes aggressive!");
    }

    void warp() {
        power += 7;
    }

    void stealBlock() {
        blocks++;
    }

    boolean isAggressive() {
        return aggressive;
    }
}
