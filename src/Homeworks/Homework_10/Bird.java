package Homeworks.Homework_10;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        if (hunger <= 8)
            System.out.println(name + ": Tweet");
        else
            super.makeSound();
    }
}
