package Classworks.Classwork_3;

public class Ghost extends Monster implements Attackable, Defendable, SpecialAbility {

    private double transparency;
    private boolean invisible;

    public Ghost(String name, int health, double power, double transparency, boolean invisible) {
        super(name, health, power);
        this.transparency = transparency;
        this.invisible = invisible;
    }

    @Override
    public void attack() {
        power += 5;
        System.out.println(name + " emits fear wave! Power: " + power);
    }

    @Override
    public void defend() {
        invisible = true;
        System.out.println(name + " fades into invisibility!");
    }

    @Override
    public void useSpecial() {
        System.out.println(name + " passes through walls!");
    }

    void fadeOut() {
        invisible = true;
    }

    void fearWave() {
        power += 5;
    }

    boolean canPassWalls() {
        return true;
    }
}
