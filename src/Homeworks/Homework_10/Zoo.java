package Homeworks.Homework_10;

public class Zoo {

    Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void morningRollCall() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
