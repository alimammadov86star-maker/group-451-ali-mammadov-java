package Homeworks.Homework_10;

public class Homework_10 {

    public static void main(String[] args) {

        Superhero hero1 = new Superhero("Storm", 80, "Alice", true);
        Superhero hero2 = new Superhero("DarkFire", 90, "Bob", false);
        Superhero hero3 = new Superhero("FlashX", 70, "Tom", true);

        hero1.showHeroCard();
        hero2.showHeroCard();
        hero3.showHeroCard();

        hero2.moralChoice();

        System.out.println("Battle");
        Superhero winner = hero1.powerLevel > hero2.powerLevel ? hero1 : hero2;
        System.out.println("Winner: " + winner.name);
    }
}
