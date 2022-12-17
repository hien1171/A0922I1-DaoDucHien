package ArrayMethod;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        int row,col;
        int array [][];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of row :");
        row= scanner.nextInt();
        System.out.print("Enter a size of col :");
        col= scanner.nextInt();

        array= new int [row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " +"["+(i+1)+"]"+"["+(j+1)+"]" + ": ");
                array[i][j]= scanner.nextInt();
            }
        }

        int sum=0;
        System.out.print("Enter a col  :");
        int number = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j==number-1){
                    sum+=array[i][j];
                }
            }

        }

        System.out.println("Result :"+sum);
    }
}
