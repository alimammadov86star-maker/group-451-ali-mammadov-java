package Classworks.classwork_8extra;

public class Team {

    String teamName;
    Superhero[] members = new Superhero[3];

    public void addHero(Superhero hero) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = hero;
                System.out.println("Герой добавлен в команду!");
                return;
            }
        }
        System.out.println("Команда полная!");
    }

    public void showTeam() {
        System.out.println("Команда " + teamName + ":");
        for (Superhero hero : members) {
            if (hero != null) {
                hero.introduce();
            }
        }
    }

    public void teamAttack() {
        System.out.println("Команда атакует!");
        for (Superhero hero : members) {
            if (hero != null) {
                hero.attack();
            }
        }
    }

    public int getTotalPower() {
        int total = 0;
        for (Superhero hero : members) {
            if (hero != null) {
                total += hero.getPowerLevel();
            }
        }
        return total;
    }
}