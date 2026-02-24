package Classworks.classwork_8extra;

public class Classwork_8extra {

    public static void main(String[] args) {

        FireHero torch = new FireHero("Torch", 85);
        IceHero frost = new IceHero("Frost", 70, 8);
        SpeedHero flash = new SpeedHero("Flash", 95, true);

        Team avengers = new Team();
        avengers.teamName = "Heroes";

        avengers.addHero(torch);
        avengers.addHero(frost);
        avengers.addHero(flash);

        avengers.showTeam();

        System.out.println("Общая сила команды: " + avengers.getTotalPower());

        avengers.teamAttack();

        SpeedHero extra = new SpeedHero("Extra", 50, false);
        avengers.addHero(extra);
    }
}