package Homeworks.Homework_7;

public class Homework_7 {
    public static void main(String[] args) {

        // 1
        Account acc = new Account("Ali", 100);
        acc.deposit(50);
        acc.withdraw(30);
        System.out.println("Баланс: " + acc.getBalance());

        // 2
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = r1.scale(2);

        System.out.println("Площадь r1: " + r1.area());
        System.out.println("Площадь r2: " + r2.area());

        // 3
        Temperature t1 = new Temperature(25);
        System.out.println("25°C в F: " + t1.toFahrenheit());

        Temperature t2 = Temperature.fromFahrenheit(77);
        System.out.println("77°F в C: " + t2.celsius);
    }
}
