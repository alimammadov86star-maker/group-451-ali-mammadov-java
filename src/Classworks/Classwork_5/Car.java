package Classworks.Classwork_5;

public class Car {

    private String brand;
    private int speed;
    private int fuel;

    public Car(String brand, int speed, int fuel) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }

    public void drive() {
        if (fuel > 0) {
            fuel -= 10;
            System.out.println(brand + " is driving...");
        } else {
        	System.out.println(brand + " has no fuel!");
        }
    }

    public void refuel(int amount) {
    	fuel += amount; 
    }

    public int getSpeed() {
    	return speed; 
    }
    public String getBrand() {
    	return brand; 
    }
}
