package Classworks.classwork_8extra;

public class SpeedHero implements Superhero {

    String name;
    int powerLevel;
    boolean isSuperFast;

    public SpeedHero(String name, int powerLevel, boolean isSuperFast) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.isSuperFast = isSuperFast;
    }

    @Override
    public void introduce() {
        System.out.println("Привет! Я " + name + " — самый быстрый в мире! Сила: " + powerLevel);
    }

    @Override
    public void attack() {
        if (isSuperFast) {
            System.out.println(name + " бьёт 10 раз за секунду!!!");
        } else {
            System.out.println(name + " быстро бьёт кулаком!");
        }
    }

    @Override
    public void defend() {
        System.out.println(name + " уворачивается со скоростью света!");
    }

    @Override
    public int getPowerLevel() {
        return powerLevel;
    }
}