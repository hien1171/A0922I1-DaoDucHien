package oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        double delta=b*b-4*a*c;
        return delta;
    }
    public double  getRoot1(){
        double root=((-b+Math.sqrt(getDiscriminant()))/(2*a));
        return root;
    }
    
    public double  getRoot2(){
        double root=((-b-Math.sqrt(getDiscriminant()))/(2*a));
        return root;
    }
    void result(){
        if(getDiscriminant()>=0){
            System.out.println("the root1 is: "+getRoot1());
            System.out.println("the root2 is: "+getRoot2());
        }else{
            System.out.println("no root");
        }
    }

    public static class Main{
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter number a: ");
            double a=scanner.nextDouble();
            System.out.println("Enter number b: ");
            double b=scanner.nextDouble();
            System.out.println("Enter number c: ");
            double c=scanner.nextDouble();
            QuadraticEquation result= new QuadraticEquation(a,b,c);
            result.result();
        }
    }
}
