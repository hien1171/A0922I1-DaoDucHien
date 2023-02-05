package fpt;

public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    Car() {

    }

    Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.convertible = convertible;
        this.enginePower = enginePower;
        this.parkingBrake = parkingBrake;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void pressAcceleratorButton() {

    }

    @Override
    public String toString() {
        return "";
    }
}
