package loop;

import java.util.Scanner;

public class Print100Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = scanner.nextInt();
        for (int i = 2; i <n ; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
            }
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
