package bank_card_management;

public class CreditCard extends Card {
    private double creditLimit;
    private double usedAmount;
    private double debt;
    public CreditCard(String cardNumber, String ownerName, String idNumber, String address, double creditLimit, double v) {
        super(cardNumber, ownerName, idNumber, address);
        this.creditLimit = creditLimit;
        this.usedAmount = 0;
        this.debt = 0;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public double getUsedAmount() {
        return this.usedAmount;
    }

    public double getDebt() {
        return this.debt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setUsedAmount(double usedAmount) {
        this.usedAmount = usedAmount;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public boolean pay(double amount) {
        if (amount > this.debt) {
            return false;
        }
        this.debt -= amount;
        return true;
    }

    public boolean use(double amount) {
        if (amount > this.creditLimit - this.usedAmount) {
            return false;
        }
        this.usedAmount += amount;
        this.debt += amount;
        return true;
    }
}
