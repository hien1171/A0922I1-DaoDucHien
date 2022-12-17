package ArrayMethod;

import java.util.Scanner;

public class MaxParallelArray {
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


        int max=array[0][0];
        int id1=0,id2=0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
              if(array[i][j]>max){
                  max=array[i][j];
                  id1=i;
                  id2=j;
              }
            }
        }

        System.out.print("Max :"+max+"["+(id1+1)+"]"+"["+(id2+1)+"]");
    }
}
