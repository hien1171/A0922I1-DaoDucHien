package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> bStack=new Stack<>();
        String input="s * (s – a) * (s – b) * (s – c)";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='('){
                bStack.push(String.valueOf(input.charAt(i)));
            }
            if(input.charAt(i)==')'){
                if(bStack.isEmpty()){
                    return;
                }

            }
        }
    }
}
