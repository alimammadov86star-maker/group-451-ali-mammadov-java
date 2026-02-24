package Homeworks.Homework_10;

import java.util.ArrayList;

public class Band {

    String name;
    ArrayList<Musician> musicians = new ArrayList<>();

    public Band(String name) {
        this.name = name;
    }

    public void addMusician(Musician m) {
        musicians.add(m);
    }

    public void rehearse() {
        for (Musician m : musicians) {
            m.playInstrument();
        }
    }

    public void perform() {
        System.out.println("The band " + name + " is performing!");
        rehearse();
        int rating = (int)(Math.random() * 10) + 1;
        System.out.println("Concert rating: " + rating + "/10");
    }
}
