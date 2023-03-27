package access_modifier;

public class Circle {
     private double radius;
     private String color;
     Circle(){
         this.radius=1.0;
         this.color="red";
     }
     Circle(double radius){
         this.radius=radius;

     }

    public void setColor(String color) {

         this.color = color;
    }

    public double getRadius() {

         return radius;
    }

    public void setRadius(double radius) {

         this.radius = radius;
    }

    public double getArea(){

         return this.radius*this.radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle x=new Circle(5);
        System.out.printf("Area: %.1f", x.getArea());
    }

}

