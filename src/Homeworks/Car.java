package Homeworks;

public class Car {
    String brand;
    String model;
    int year;
    int speed;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    void accelerate(int value) {
        speed += value;
    }

    void brake(int value) {
        speed -= value;
        if (speed < 0) speed = 0;
    }
}
