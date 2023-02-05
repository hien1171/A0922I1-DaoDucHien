package fpt;
import java.util.Scanner;
public class menu {
    static Scanner input= new Scanner(System.in);


    public static int menu() {
        int choice;
        System.out.println("Menu");
        System.out.println("1.Calculate the Sum ");
        System.out.println("2.Calculate the Subtract ");
        System.out.println("3.Calculate the Multiplication ");
        System.out.println("4.Calculate the Division ");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        return choice;
    }
    public static int sum(int number1, int number2){
        int a =number1+number2;
        return a;
    }
    public static int subtract(int number1, int number2){
        int a =number1-number2;
        return a;
    }
    public static int multiplication(int number1, int number2){
        int a =number1*number2;
        return a;
    }
    public static float division(int number1, int number2) {
        if (number2 == 0 && number1 != 0) {
            return 0;
        } else {
            int a = number1 / number2;
            return a;
        }
    }


    public static void main(String[] args) {
        int choice=0,check=1;
        int number1,number2;
        System.out.println("Enter number one : ");
        number1=input.nextInt();
        System.out.println("Enter number two : ");
        number2=input.nextInt();
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    int sum=sum(number1,number2);
                    System.out.println(sum);
                    break;
                case 2:
                    int sub=subtract(number1,number2);
                    System.out.println(sub);
                    break;
                case 3:
                    int mul=multiplication(number1,number2);
                    System.out.println(mul);
                    break;
                case 4:
                    float div=division(number1,number2);
                    if (div==0&&number1!=0){
                        System.out.println("Error");
                    }
                    else {
                        System.out.println(div);
                    }
                default:
                    if (choice == 5) {
                        check=0;
                    }
            }
        } while(check==1);

    }
}
