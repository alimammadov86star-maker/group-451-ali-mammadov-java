package Classworks.classwork_8extra;

public class FireHero implements Superhero {

    String name;
    int powerLevel;

    public FireHero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    @Override
    public void introduce() {
        System.out.println("Я " + name + "! Мастер огня! Мой уровень силы: " + powerLevel);
    }

    @Override
    public void attack() {
        System.out.println(name + " бросает огненный шар! БУМ!");
    }

    @Override
    public void defend() {
        System.out.println(name + " создаёт огненный щит!");
    }

    @Override
    public int getPowerLevel() {
        return powerLevel;
    }
}