package Classworks.Classwork_5;

public class PoisonMonster extends Monster {

    public PoisonMonster() {
        super("Poison", 60, 18);
    }

    @Override
    public void specialAbility() {
        System.out.println("Poison monster releases toxic gas!");
    }
}
