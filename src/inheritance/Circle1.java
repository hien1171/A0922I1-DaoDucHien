package inheritance;

public class Circle1 {
    private double radius;
    private String color;
    public Circle1(double radius,String color){
        this.radius=radius;
        this.color = color;
    }
    public Circle1(){

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
    public String toString(){
        return "Radius: "+this.getRadius()+",color: "+this.getColor()+",area: "+this.getArea();
    }
    public static class  Cylinder1 extends Circle1{
        private double height;
        public Cylinder1(double radius,String color,double height){
            super(radius,color);
            this.height=height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }
}
