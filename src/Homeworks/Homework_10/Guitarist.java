package Homeworks.Homework_10;

public class Guitarist extends Musician implements Soloist {

    public Guitarist(String name, int experienceYears) {
        super(name, experienceYears);
    }

    @Override
    public void playInstrument() {
        System.out.println(name + " plays electric guitar!");
    }

    @Override
    public void makeSolo() {
        System.out.println(name + " performs an epic guitar solo!");
    }
}