package Homeworks.Homework_10;

public class Superhero {

    String name;
    int powerLevel;
    String secretIdentity;
    boolean isGood;

    public Superhero(String name, int powerLevel, String secretIdentity, boolean isGood) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.secretIdentity = secretIdentity;
        this.isGood = isGood;
    }

    public void showHeroCard() {
        System.out.println("===== HERO CARD =====");
        System.out.println("Name: " + name);
        System.out.println("Secret Identity: " + secretIdentity);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("Side: " + (isGood ? "Good" : "Evil"));
        System.out.println("=====================");
    }

    public void usePower() {
        System.out.println("Superhero " + name + " uses power level " + powerLevel + "!");
    }

    public void moralChoice() {
        if (!isGood && Math.random() > 0.5) {
            isGood = true;
            System.out.println(name + " betrayed evil and became good!");
        }
    }
}
