package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class binaryToDecimal {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());

        while(num>0){
          stack.push(num%2);
          num=num/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }

}
