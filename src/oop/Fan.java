package oop;

public class Fan{
   private final int slow=1;
   private final int medium=2;
   private final int fast=3;
   private int speed;
   private boolean on;
   private double radius;
   private String color;

   public int getSpeed(){
       return speed;
   }
   public void setSpeed(int speed){
       this.speed=speed;
    }
   public double getRadius(){
       return radius;
   }
   public void setRadius(double radius){
       this.radius=radius;
   }
   public boolean isOn(){
       return on;
   }
   public void setOn(boolean on){
       this.on=on;
   }
   public String getColor(){
       return color;
   }
   public void setColor(String color){
       this.color=color;
   }

   public Fan(){
       this.speed=slow;
       this.on=false;
       this.radius=5;
       this.color="Blue";
   }
   public Fan(int speed,boolean on,double radius,String color){
       this.speed=speed;
       this.on=on;
       this.radius=radius;
       this.color=color;
   }

    public String toString() {
        if (on) {
            return " Fan is on."+"Speed: " + this.getSpeed() + ", Radius: " + this.getRadius() + ", Color: " + this.getColor()  ;
        } else {
            return  "Fan is off. "+"Radius: " + this.getRadius() + ", Color: " + this.getColor() ;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Fan(3,true,10.0f,"yellow"));
        System.out.println(new Fan(2,false,5.0f,"blue"));
    }



}
