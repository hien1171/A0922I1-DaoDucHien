package bai1;
import java.util.Scanner;

public class Number {
    static String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 20) {
            System.out.println(underTwenty(n));
        } else if (n < 100) {
            System.out.println(twoDigits(n));
        } else {
            System.out.println(threeDigits(n));
        }
    }

    public static String threeDigits(int n) {
        if (n % 100 == 0) {
            return ones[n / 100] + " hundred";
        } else if (n % 100 < 20){
            return ones [n / 100] + " hundred and " + underTwenty(n%100);
        } else {
            return ones [n / 100] + " hundred and " + twoDigits(n%100);
        }
    }

    public static String twoDigits(int n) {
        if (n % 10 == 0) {
            return tens[n/10-2];
        } else {
            return tens[n/10-2] + " " + tens[n%10];
        }
    }

    public static String underTwenty(int n) {
        return ones [n];
    }
}
