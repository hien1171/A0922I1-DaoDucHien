package dsa_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input= scanner.nextLine();
        Stack<String> stack=new Stack<>();
        Queue<String> queue=new LinkedList<>();
        for (int i = 0; i <input.length() ; i++) {
            stack.push(String.valueOf(input.charAt(i)));
            queue.add(String.valueOf(input.charAt(i)));
        }
        if(stack.equals(queue)){
            System.out.println("Palindrome! ");
        }
        else {
            System.out.println("The string is not a palindrome");
        }
    }
}
