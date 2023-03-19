package aaa.Models;

public class CreditCard extends Card {
    private double debt;
    private double limit;

    public CreditCard(String cardNumber, String ownerName, String cccd, String address, double debt, double limit) {
        super(cardNumber, ownerName, cccd, address);
        this.debt=debt;
        this.limit=limit;
    }


    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return super.toString()+
                "CreditCard{" +
                "debt=" + debt +
                ", limit=" + limit +
                '}';
    }
    public String toStringFile(){
        return "Credit"+super.toStringFile()+","+debt+","+limit;
    }
}
