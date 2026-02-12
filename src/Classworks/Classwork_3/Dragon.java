package Classworks.Classwork_3;

public class Dragon extends Monster
        implements Attackable, Defendable, SpecialAbility {

    private boolean canFly;
    private int armor;

    public Dragon(String name, int health, double power, boolean canFly, int armor) {
        super(name, health, power);
        this.canFly = canFly;
        this.armor = armor;
    }


    @Override
    public void attack() {

        power += 10;
        System.out.println(name + " Bro Armor: " + power);
    }

    @Override
    public void defend() {

        armor += 5;
        System.out.println(name + " bro Armor: " + armor);
    }

    @Override
    public void useSpecial() {

        if (canFly) {
            power += 5;
            System.out.println(name + " bro");
        } else {
            System.out.println(name + " cant'fly");
        }
    }


    void flameBurst() {
        power += 10;
    }

    void scaleDefense(int damage) {
        int finalDamage = damage - armor;
        if (finalDamage < 0) finalDamage = 0;
        loseHealth(finalDamage);
    }

    boolean wingCheck() {
        return canFly;
    }
}
