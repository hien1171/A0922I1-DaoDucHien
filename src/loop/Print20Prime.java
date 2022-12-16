package loop;

import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = scanner.nextInt();
        int count = 0;
        int num=0;
        while(count<n){
            if(isPrime(num)){
                System.out.print(num + "  ");
                count++;
            }
            num++;
        }

    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
