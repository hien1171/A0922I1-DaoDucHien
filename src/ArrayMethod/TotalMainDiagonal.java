package ArrayMethod;

import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        int row,col;
        int array [][];

        Scanner scanner = new Scanner(System.in);
        do{
        System.out.print("Enter a size of row :");
        row= scanner.nextInt();
        System.out.print("Enter a size of col :");
        col= scanner.nextInt();
        if(row!=col){
            System.out.println("This is not a square matrix! ");
            }
        } while(row!=col);

        array= new int [row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " +"["+(i+1)+"]"+"["+(j+1)+"]" + ": ");
                array[i][j]= scanner.nextInt();
            }
        }

        int sum=0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j==i){
                    sum+=array[i][j];
                }
            }

        }

        System.out.println("Result :"+sum);
    }
}
