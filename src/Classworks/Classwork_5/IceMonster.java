package Classworks.Classwork_5;

public class IceMonster extends Monster {

    public IceMonster() {
        super("Ice", 70, 12);
    }

    @Override
    public void specialAbility() {
        System.out.println("Ice monster freezes the enemy!");
    }
}
