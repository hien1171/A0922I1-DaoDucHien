package aaa.Controlleer;

import aaa.service.CardImpl;

import java.util.Scanner;

public class cardController {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int choice=0;
        int check=1;
        CardImpl card=new CardImpl();
        do{
            choice=menu();
            switch (choice){
                case 1:
                    CardImpl.dangkithe();
                    break;
                case 2:
                    CardImpl.saveToFile();
                    break;
                case 3:
                    CardImpl.loadFromFile();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    CardImpl.searchCard();
                    break;
                case 7:
                    CardImpl.deleteCard();
                    break;
                case 8:
                    break;
                case 9:
                    check=0;
                    break;
                default:
                    System.out.println("Nhập lại!");
                    break;
            }
        }
        while (check==1);

    }
    public static int menu() {
        int choice;
        System.out.println("Menu");
        System.out.println("1. Đăng kí thẻ ");
        System.out.println("2. Xuất ra file  ");
        System.out.println("3. Đọc từ file");
        System.out.println("4. Thanh toán bằng thẻ ");
        System.out.println("5. Nộp tiền bằng thẻ ");
        System.out.println("6. Tìm card ");
        System.out.println("7. Xóa thẻ ");
        System.out.println("8. Chuyển khoản ");
        System.out.println("9. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        return choice;
    }
}
