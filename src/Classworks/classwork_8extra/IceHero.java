package Classworks.classwork_8extra;

public class IceHero implements Superhero {

    String name;
    int powerLevel;
    int freezePower;

    public IceHero(String name, int powerLevel, int freezePower) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.freezePower = freezePower;
    }

    @Override
    public void introduce() {
        System.out.println("Меня зовут " + name + ". Я замораживаю всё на своём пути! Сила: " + powerLevel);
    }

    @Override
    public void attack() {
        System.out.println(name + " выпускает ледяные шипы! Замерзай!");
    }

    @Override
    public void defend() {
        System.out.println(name + " окружает себя ледяной стеной!");
    }

    @Override
    public int getPowerLevel() {
        return powerLevel;
    }
}