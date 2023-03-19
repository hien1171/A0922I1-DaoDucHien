package bank_card_management;

public abstract class Card {
    protected String cardNumber;
    protected String ownerName;
    protected String idNumber;
    protected String address;
    public Card(String cardNumber, String ownerName, String idNumber, String address) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.idNumber = idNumber;
        this.address = address;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

