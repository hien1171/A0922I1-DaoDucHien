package fpt.abstrac_interface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ResizableCircle newCircle=new ResizableCircle(5,"blue");
        Scanner x= new Scanner(System.in);
        System.out.print("Enter a percent :");
        int percent= x.nextInt();
        System.out.println( "Area before resizing : "+newCircle.getArea());
        newCircle.setRadius( newCircle.resize(percent));
        System.out.println("Area after resizing : "+newCircle.getArea());


    }
}
