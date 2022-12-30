package abstract_interface;
import java.util.Random;


interface Resizeable {
    void resize(double percent );
}
public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


}

// Circle
 class Circle extends Shape implements Resizeable{

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getResizeArea(){
        Random rand = new Random();
        int ranNum = rand.nextInt(100)+1;
        resize(ranNum);
        getArea();
        return getArea();
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                +", area ="
                +getArea()
                +",area after resizing ="
                + getResizeArea()
                + ", which is a subclass of "
                + super.toString();
    }

     @Override
     public void resize(double percent) {
          this.radius+=this.radius*percent/100;

     }


     public static void main(String[] args) {
         Circle []circleArray=new Circle[3];
         circleArray[0]=new Circle(3);
         circleArray[1]=new Circle(4);
         circleArray[2]=new Circle(5);
         for(int i=0;i<3;i++){
             System.out.println(circleArray[i].getArea());
         }
         for (int i = 0; i < 3; i++) {
             System.out.println(circleArray[i].getResizeArea());
         }
     }

 }

// rectangle
 class Rectangle extends Shape implements Resizeable {

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public double getResizeArea(){
        Random rand = new Random();
        int ranNum = rand.nextInt(100)+1;
        resize(ranNum);
        getArea();
        return getArea();
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                +", area ="
                +getArea()
                +",area after resizing ="
                + getResizeArea()
                + ", which is a subclass of "
                + super.toString();
    }

     @Override
     public void resize(double percent) {
         this.width += this.width * (percent / 100);
         this.length += this.length * (percent / 100);
     }

     public static void main(String[] args) {


         Rectangle [] rectangleArray=new Rectangle[3];
         rectangleArray[0]=new Rectangle(3,4);
         rectangleArray[1]=new Rectangle(5,6);
         rectangleArray[2]=new Rectangle(7,8);
         for(int i=0;i<3;i++){
             System.out.println(rectangleArray[i].getArea());
         }
         for(int i=0;i<3;i++){

             System.out.println(rectangleArray[i].getResizeArea());
         }

     }
 }

 // Square
 class Square extends Shape implements Resizeable{
    private double side;

    public Square(double side) {
        this.side=side;
    }

    public Square(double side,String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getResizeArea(){
         Random rand = new Random();
         int ranNum = rand.nextInt(100)+1;
         resize(ranNum);
         getArea();
         return getArea();
     }

    @Override
    public String toString() {
        return "Square with side= "
                + getSide()
                + ", area: "
                + getArea()
                +",area after resizing: "
                +getResizeArea();
    }
    @Override
    public void resize(double percent) {
        this.side += this.side * (percent / 100);
    }

     public static void main(String[] args) {
        Square[] squareArray= new Square[3];

         squareArray[0]=new Square(3);
         squareArray[1]=new Square(4);
         squareArray[2]=new Square(5);

         for(int i=0;i<3;i++){
             System.out.println(squareArray[i].getArea());
         }

         for(int i=0;i<3;i++){
            System.out.println(squareArray[i].getResizeArea());
        }

     }
}


// Test
 class ShapeTest {
    public static void main(String[] args) {
        Shape [] shapeArray=new Shape[3];
        shapeArray[0]=new Circle(3);
        shapeArray[1]=new Rectangle(2,3);
        shapeArray[2]=new Square(4);
        for (int i = 0; i < 3; i++) {
            System.out.println(shapeArray[i]);
        }

    }

}













