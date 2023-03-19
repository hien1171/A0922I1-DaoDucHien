package aaa.Models;

public class ATMCard extends Card{
    private double balance=0;

    public ATMCard(String cardNumber, String ownerName, String cccd, String address, double balance) {
        super(cardNumber, ownerName, cccd, address);
        this.balance=balance;

    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString()+
                "ATMCard{" +
                "balance=" + balance +
                '}';
    }
    public String toStringFile(){
        return "ATM"+super.toStringFile()+","+balance;
    }
}
