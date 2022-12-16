package ArrayMethod;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Enter your number you want to delete : ");
        int num= scanner.nextInt();
        int index = 0;
        for (int j = 0; j <array.length ; j++) {
            if(num==array[j]){
                System.out.println(j);
            }
             index=j;
        }
        for (int j = index; j < array.length-1 ; j++) {
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;

        }
        System.out.printf("\n%-20s%s", "Delete array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        
    }
}
