package Homeworks.Homework_10;

public class Vocalist extends Musician implements Soloist {

    public Vocalist(String name, int experienceYears) {
        super(name, experienceYears);
    }

    @Override
    public void playInstrument() {
        System.out.println(name + " sings loudly!");
    }

    @Override
    public void makeSolo() {
        System.out.println(name + " performs a vocal solo!");
    }
}
