package Classworks.Classwork_5;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
    	balance += amount; 
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
        	balance -= amount;
        }
        else {
        	System.out.println("Not enough balance!");
        }
    }

    public void transfer(BankAccount other, double amount) {
        if (amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        } else {
        	System.out.println("Transfer failed: insufficient balance.");
        }
    }

    public void showBalance() {
        System.out.println(owner + " balance: " + balance);
    }
}
