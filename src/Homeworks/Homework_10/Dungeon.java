package Homeworks.Homework_10;

public class Dungeon {

    public void battle(Fighter[] team, Monster boss) {

        while (boss.isAlive()) {

            for (Fighter f : team) {
                if (f.isAlive()) {
                    boss.takeDamage(f.attack());
                }
            }

            if (!boss.isAlive()) {
                System.out.println("Team wins!");
                return;
            }

            for (Fighter f : team) {
                if (f.isAlive()) {
                    f.takeDamage(boss.attack());
                }
            }
        }

        System.out.println("Boss wins!");
    }
}
