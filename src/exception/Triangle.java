package exception;

import java.util.Scanner;

public class Triangle {
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(side1+side2<side3||side1+side3<side2||side2+side3<side1||side1<=0||side2<=0||side3<=0)
            throw new IllegalTriangleException("Triangle violet the rule.");
        else
            System.out.println("Triangle follows the rule.");
    }
    public static void main(String args[]){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a: ");
            int a=scanner.nextInt();
            System.out.println("Enter b: ");
            int b= scanner.nextInt();
            System.out.println("Enter c: ");
            int c= scanner.nextInt();
            Triangle obj = new Triangle(a,b,c);
        }catch(Exception m){System.err.println("Exception occured: "+m);
        }
    }
}

class IllegalTriangleException extends Exception {
    IllegalTriangleException(String s) {
        super(s);
    }

}
