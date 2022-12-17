package ArrayMethod;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1,size2 ;
        int [] array1;
        int [] array2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of array 1:");
        size1= scanner.nextInt();
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element of array 1 at position" + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Enter a size of array 2:");
        size2= scanner.nextInt();
        array2 = new int[size2];
        int j=0;
        while (j < array2.length) {
            System.out.print("Enter element of array 2 at position" + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }


        int size3= size1+size2;
        int [] array3=new int[size3];

        for (int k = 0; k <array1.length ; k++) {
            array3[k]=array1[k];

        }

            for (int l = array1.length; l < array3.length; l++) {
                array3[l]=array2[l- array1.length];
            }


        System.out.printf("\n%-20s%s", "Merge array: ", "");
        for (int m = 0; m < array3.length; m++) {
            System.out.printf(array3[m] + "\t");
        }


    }
}
