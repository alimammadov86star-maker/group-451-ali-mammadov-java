package Classworks.Classwork_5;

public class Battle {
    public static void main(String[] args) {

        Hero hero = new Hero("Warden", 100, 20, 1);
        Monster monster = new FireMonster();

        while (hero.getHealth() > 0 && monster.isAlive()) {

            hero.attack();
            monster.takeDamage(hero.getStrength());

            if (monster.isAlive()) {
                monster.attack();
                hero.takeDamage(monster.getDamage());
            }
        }

        System.out.println("Battle finished!");
    }
}
