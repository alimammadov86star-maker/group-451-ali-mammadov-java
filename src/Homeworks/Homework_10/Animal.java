package Homeworks.Homework_10;

public class Animal {

    String name;
    int age;
    int hunger;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = (int)(Math.random() * 10);
    }

    public void makeSound() {
        if (hunger > 8) {
            System.out.println(name + " is too hungry and stays silent...");
        }
    }

    public void feed() {
        hunger -= 3;
        if (hunger < 0) hunger = 0;
    }
}
