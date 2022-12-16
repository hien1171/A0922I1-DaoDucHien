package bai1;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        int rate=24000;
        Scanner scanner= new Scanner(System.in);
        float usd;
        System.out.println("Enter your money: ");
        usd=scanner.nextInt();
        float result=usd/rate;
        System.out.printf("Vnd: %f",result);


    }
}
