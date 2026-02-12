package Homeworks.Homework_7;

public class Account {

    private String owner;
    private double balance;
    
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств!");
        } else if (amount > 0) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
