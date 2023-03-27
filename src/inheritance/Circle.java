package inheritance;

public class Circle {
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

    public String toString(){
        return "Radius: "+this.getRadius()+",color: "+this.getColor()+",area: "+this.getArea();
    }
    public static class Cylinder extends Circle {
        private double height;

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }


        public Cylinder(double radius, String color,double height) {
            super(radius, color);
            this.height=height;
        }
        public double areaCylinder() {
            return 2 * 3.14 * this.getRadius() * (this.getRadius() + height);
        }
        public double volumeCylinder() {
            return super.getArea() * this.height;
        }
        public String toString2(){
            return "Radius: "+this.getRadius()+",color: "+this.getColor()+",area: "+this.areaCylinder()+",volume: "+this.volumeCylinder();
        }


    }
    public static void main(String[] args) {
        Circle circle = new Circle(2, "White");
        Cylinder cylinder = new Cylinder(8, "Pink", 9);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString2());
    }


}
