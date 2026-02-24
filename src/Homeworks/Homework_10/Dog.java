package Homeworks.Homework_10;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        if (hunger <= 8)
            System.out.println(name + ": Woof");
        else
            super.makeSound();
    }
}
