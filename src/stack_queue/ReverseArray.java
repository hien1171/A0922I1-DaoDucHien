package stack_queue;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> arrayStack = new Stack<>();
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i + "]");
            arr[i] = arrayStack.push(sc.nextInt());
        }
        System.out.println("Array before reversing");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            arr[i] = arrayStack.pop();
        }
        System.out.println("Array after reversing: ");
        System.out.println(Arrays.toString(arr));
    }

   
}
