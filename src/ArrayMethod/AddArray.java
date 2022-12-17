package ArrayMethod;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size: ");
        size = input.nextInt();

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.println("Enter the number you want to add: ");
        int num = input.nextInt();

        System.out.println("Enter the position you want to add: ");
        int index = input.nextInt();


        int[] array2;
        array2 = new int[size + 1];
        for (int j = 0; j < array.length; j++) {
            array2[j] = array[j];
        }

        for (int j = 0; j < array2.length; j++) {
            if(j==index-1) {
                for (int k = array2.length - 1; k >= index; k--) {
                    array2[k] = array2[k - 1];
                }
                  array2[j] = num;
            }
        }

        System.out.printf("\n%-20s%s", "Add array: ", "");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
    }
}
