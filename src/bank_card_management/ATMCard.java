package bank_card_management;

public class ATMCard extends Card{
    private double balance;
    public ATMCard(String cardNumber, String ownerName, String idNumber, String address, double balance) {
        super(cardNumber, ownerName, idNumber, address);
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}

