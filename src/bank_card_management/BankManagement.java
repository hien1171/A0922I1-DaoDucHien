package bank_card_management;
import java.util.*;
import java.io.*;
public class BankManagement {
    private static List<Card> cardList = new ArrayList<>();
    private static String[] tokens;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("----------- Quản lý thẻ của ngân hàng -----------");
            System.out.println("1. Đăng ký thẻ");
            System.out.println("2. Xuất tất cả các thẻ đang có trong chương trình ra file product.txt");
            System.out.println("3. Đọc danh sách thẻ từ file product.txt");
            System.out.println("4. Thanh toán bằng thẻ");
            System.out.println("5. Nộp tiền vào thẻ");
            System.out.println("6. Tìm thẻ theo họ tên hoặc CCCD");
            System.out.println("7. Hủy thẻ");
            System.out.println("8. Chuyển khoản");
            System.out.println("9. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (1-9): ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    registerCard(scanner);
                    break;
                case 2:
                    try {
                        FileWriter writer = new FileWriter(".\\src\\bank_card_management\\");
                        for (Card card : cardList) {
                            writer.write(card.toString() + "\n");
                        }
                        writer.close();
                        System.out.println("Đã xuất dữ liệu ra file product.txt");
                    } catch (IOException e) {
                        System.out.println("Lỗi khi xuất dữ liệu ra file product.txt");
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    // Đọc danh sách thẻ từ file product.txt
                    try {
                        File file = new File(".\\src\\bank_card_management\\");
                        Scanner scannerFile = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            String[] tokens = line.split(",");
                            if (tokens[0].equals("ATM")) {
                                ATMCard atmCard = new ATMCard(tokens[1], tokens[2], tokens[3], tokens[4], Double.parseDouble(tokens[5]));
                                cardList.add(atmCard);
                            } else if (tokens[0].equals("Credit")) {
                                CreditCard creditCard = new CreditCard(tokens[1], tokens[2], tokens[3], tokens[4], Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]));
                                cardList.add(creditCard);
                            }
                        }
                        scanner.close();
                        System.out.println("Đã đọc dữ liệu từ file product.txt");
                    } catch (FileNotFoundException e) {
                        System.out.println("Không tìm thấy file product.txt");
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi khi đọc dữ liệu từ file product.txt: Số dư, dư nợ hoặc hạn mức phải là kiểu số");
                    } catch (Exception e) {
                        System.out.println("Lỗi khi đọc dữ liệu từ file product.txt");
                        e.printStackTrace();
                    }
                    break;
                    /* exportToFile();
                    break;
                case 3:
                    readFromFile();
                    break;
                case 4:
                    payWithCard(scanner);
                    break;
                case 5:
                    deposit(scanner);
                    break;
                case 6:
                    searchCard(scanner);
                    break;
                case 7:
                    deleteCard(scanner);
                    break;
                case 8:
                    transfer(scanner);
                    break;
                    */

                case 9:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.");
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
        scanner.close();
    }

    private static void registerCard(Scanner scanner) {
        System.out.println("---------- Đăng ký thẻ ----------");
        System.out.println("1. Thẻ ATM");
        System.out.println("2. Thẻ Credit card");
        System.out.print("Mời bạn chọn loại thẻ (1-2): ");
        int cardType = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String cardNumber;
        String ownerName;
        String cccd;
        String address;

        while (true) {
            System.out.print("Nhập số thẻ (12 số): ");
            cardNumber = scanner.nextLine();
            if (cardNumber.length() != 12) {
                System.out.println("Số thẻ phải gồm 12 số. Vui lòng nhập lại.");
            } else if (isCardExist(cardNumber)) {
                System.out.println("Số thẻ đã tồn tại. Vui lòng nhập lại.");
            } else {
                break;
            }
        }

        System.out.print("Nhập tên chủ thẻ: ");
        ownerName = scanner.nextLine();

        while (true) {
            System.out.print("Nhập CCCD (12 chữ số): ");
            cccd = scanner.nextLine();
            while (cccd.length() != 12 || !isNumeric(cccd)) {
                System.out.println("CCCD phải có 12 chữ số và là số. Vui lòng nhập lại: ");
                cccd = scanner.nextLine();
            }


            System.out.println("Nhập địa chỉ: ");
            address = scanner.nextLine();

// Kiểm tra thẻ đã tồn tại chưa
            if (findCardByNumber(cardList, cardNumber) != null) {
                System.out.println("Thẻ đã tồn tại. Không thể đăng ký thêm.");
                return;
            }

// Đăng ký thẻ
            if (cardType==1) {
                System.out.println("Nhập số dư ban đầu: ");
                double balance = scanner.nextDouble();
                scanner.nextLine(); // consume the remaining newline
                // Tạo thẻ ATM mới và thêm vào danh sách
                ATMCard newCard = new ATMCard(cardNumber, ownerName, cccd, address, balance);
                cardList.add(newCard);
                System.out.println("Đăng ký thẻ ATM thành công!");
            } else if (cardType==2) {
                System.out.println("Nhập hạn mức: ");
                double limit = scanner.nextDouble();
                scanner.nextLine(); // consume the remaining newline
                // Tạo thẻ Credit Card mới và thêm vào danh sách
                CreditCard newCard = new CreditCard(cardNumber, ownerName, cccd, address, limit, Double.parseDouble(tokens[6]));
                cardList.add(newCard);
                System.out.println("Đăng ký thẻ Credit Card thành công!");
            } else {
                System.out.println("Không hỗ trợ loại thẻ này.");
            }
              break;
        }


    }
    public static boolean isCardExist(String cardNumber) {
        for (Card card : cardList) {
            if (card.getCardNumber().equals(cardNumber)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static Card findCardByNumber(List<Card> cardList, String cardNumber) {
        for (Card card : cardList) {
            if (card.getCardNumber().equals(cardNumber)) {
                return card;
            }
        }
        return null;
    }
}
