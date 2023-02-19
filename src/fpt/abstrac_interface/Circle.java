package fpt.abstrac_interface;

public class Circle implements GeometricObject{
    private double radius;
    private String color;
    public Circle( double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    public String toString(){
        return "Radius: "+this.getRadius()+",color: "+this.getColor()+",area: "+this.getArea();
    }

}
