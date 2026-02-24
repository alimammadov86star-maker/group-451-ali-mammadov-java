package Classworks.Classwork_8;

public class Car {
    String brand;
    int year;
    double fuelLevel;
    boolean engineRunning;

    public Car(String brand, int year, double fuelLevel) {
        this.brand = brand;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.engineRunning = false;
    }

    public void startEngine() {
        if (fuelLevel > 0) {
            engineRunning = true;
            System.out.println("Двигатель запущен.");
        } else {
            System.out.println("Недостаточно топлива!");
        }
    }

    public void stopEngine() {
        engineRunning = false;
        System.out.println("Двигатель заглушен.");
    }

    public void refuel(double liters) {
        if (liters <= 0) return;

        if (fuelLevel + liters > 100) {
            fuelLevel = 100;
        } else {
            fuelLevel += liters;
        }
        System.out.println("Заправлено. Топливо: " + fuelLevel + "%");
    }

    public String status() {
        return "Марка: " + brand +
                ", " + year + " г., Топливо: " +
                fuelLevel + "%, Двигатель: " +
                (engineRunning ? "включен" : "выключен");
    }
}