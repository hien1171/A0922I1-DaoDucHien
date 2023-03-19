package aaa.Models;

public abstract class Card {
    private String cardNumber;
    private String ownerName;
    private String cccd;
    private String address;
    Card(String cardNumber, String ownerName,String cccd,String address){
        this.cardNumber=cardNumber;
        this.ownerName=ownerName;
        this.cccd=cccd;
        this.address=address;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", ownerName='" + ownerName + '\'' +
                ", cccd=" + cccd +
                ", address='" + address + '\'' +
                '}';
    }
    public String toStringFile(){
        return ","+cardNumber+","+ownerName+","+cccd+","+address;

    }
}
