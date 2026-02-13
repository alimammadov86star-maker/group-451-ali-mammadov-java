package Classworks.Classwork_5;

public class FireMonster extends Monster {

    public FireMonster() {
        super("Fire", 80, 15);
    }

    @Override
    public void specialAbility() {
        System.out.println("Fire monster throws a fireball!");
    }
}
