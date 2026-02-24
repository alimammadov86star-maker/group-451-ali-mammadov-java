package Homeworks.Homework_10;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        if (hunger <= 8)
            System.out.println(name + ": Meow");
        else
            super.makeSound();
    }
}
