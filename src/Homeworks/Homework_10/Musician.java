package Homeworks.Homework_10;

public abstract class Musician {

    String name;
    int experienceYears;

    public Musician(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public abstract void playInstrument();
}
