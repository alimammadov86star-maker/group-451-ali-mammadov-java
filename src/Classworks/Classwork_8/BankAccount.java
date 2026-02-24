package Classworks.Classwork_8;

public class BankAccount {
    String accountNumber;
    double balance;
    double monthlyRate;

    public BankAccount(String accountNumber, double balance, double monthlyRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.monthlyRate = monthlyRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: " + amount);
        }
    }

    public boolean canWithdraw(double amount) {
        return amount > 0 && balance >= amount;
    }

    public void withdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            System.out.println("Снятие: " + amount);
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public void applyMonthlyInterest() {
        double interest = balance * (monthlyRate / 100);
        balance += interest;
        System.out.println("Начислены проценты: " + interest);
    }

    public void printBalance() {
        System.out.println("Баланс: " + balance);
    }
}