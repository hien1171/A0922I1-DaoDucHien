package aaa.service;

import aaa.Models.ATMCard;
import aaa.Models.Card;
import aaa.Models.CreditCard;
import java.io.*;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardImpl  {
    static Scanner scanner=new Scanner(System.in);
    static List<Card> cardList=new ArrayList<Card>();

    private String filename;

    public static void dangkithe() {
        System.out.println("chọn thẻ:");
        System.out.println("1.ATM ");
        System.out.println("2.Credit Card ");
        int cardType = Integer.parseInt(scanner.nextLine());

        String cardNumber;
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


        System.out.println("Nhap ten chu the");
        String ownerName = scanner.nextLine();

        String cccd;
        while (true) {
            System.out.print("Nhập CCCD (12 chữ số): ");
            cccd = scanner.nextLine();
            while (cccd.length() != 12 || !isNumeric(cccd)) {
                System.out.println("CCCD phải có 12 chữ số và là số. Vui lòng nhập lại: ");
                cccd = scanner.nextLine();
            }

            System.out.println("Nhap dia chi: ");
            String address = scanner.nextLine();

            if (findCardByNumber(cardList, cardNumber) != null) {
                System.out.println("Thẻ đã tồn tại. Không thể đăng ký thêm.");
                return;
            }


            if (cardType == 1) {
                System.out.println("Nhap so du: ");
                double balance = Double.parseDouble(scanner.nextLine());
                ATMCard atmCard = new ATMCard(cardNumber, ownerName, cccd, address, balance);
                cardList.add(atmCard);
                System.out.println("Added new atm card! ");

            } else if (cardType == 2) {
                System.out.println("Nhap du no: ");
                double debt = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap han muc: ");
                double limit = Double.parseDouble(scanner.nextLine());
                CreditCard creditCard = new CreditCard(cardNumber, ownerName, cccd, address, debt, limit);
                cardList.add(creditCard);
                System.out.println("Added new credit card!");

            }
            else{
                System.out.println("Khong ho tro loai the nay! ");
            }
            break;
        }
    }



    public static Card findCardByNumber(List<Card> cardList, String cardNumber) {
        for (Card card : cardList) {
            if (card.getCardNumber().equals(cardNumber)) {
                return card;
            }
        }
        return null;
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
    // doc ghi file
    public static void saveToFile(){
        try {
            FileWriter writer = new FileWriter("C:\\Users\\DUC HIEN\\OneDrive\\Máy tính\\Codegym\\module2\\module2\\src\\aaa\\Data\\card.txt");
            for (Card card : cardList) {
                writer.write(card.toStringFile() + "\n");
            }
            writer.close();
            System.out.println("Đã xuất dữ liệu ra file card.txt");
        } catch (IOException e) {
            System.out.println("Lỗi khi xuất dữ liệu ra file card.txt");
            e.printStackTrace();
        }
    }
    public static void loadFromFile() {
        try {
            File file = new File("C:\\Users\\DUC HIEN\\OneDrive\\Máy tính\\Codegym\\module2\\module2\\src\\aaa\\Data\\card.txt");
            Scanner scanner = new Scanner(file);
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
            System.out.println("Đã đọc dữ liệu từ file card.txt");
            for (int i = 0; i < cardList.size(); i++) {
                System.out.println(cardList.get(i).toStringFile());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file card.txt");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi khi đọc dữ liệu từ file card.txt: Số dư, dư nợ hoặc hạn mức phải là kiểu số");
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc dữ liệu từ file card.txt");
            e.printStackTrace();
        }
    }
    }

    public  static void searchCard() {
        System.out.println("Nhap ho ten hoac CMND: ");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (Card card : cardList) {
            if (card.getOwnerName().equalsIgnoreCase(keyword) || card.getCccd().equalsIgnoreCase(keyword)) {
                System.out.println(card.toString());
                found = true;
            }
            if (!found) {
                System.out.println("Khong tim thay.");
            }
        }
    }

    public static void deleteCard(){
        System.out.println("Nhap so the can huy: ");
        String cardNumber=scanner.nextLine();
        boolean deleted=false;
        for (int i = 0; i < cardList.size(); i++) {
            Card card=cardList.get(i);
            if(card.getCardNumber().equals(cardNumber)){
                if(card instanceof ATMCard){
                    cardList.remove(i);
                    System.out.println("Da xoa the ATM "+cardNumber);
                    deleted=true;
                } else if (card instanceof CreditCard) {
                    CreditCard creditCard=(CreditCard) card;
                    if(creditCard.getDebt()<=0){
                        cardList.remove(i);
                        System.out.println("ddax xoa the Credit Card"+cardNumber);
                        deleted=true;
                    }else {
                        System.out.println("Khong the xoa the Credit Card "+cardNumber);
                    }

                }
                break;
            }
        }
    }

    public void payWithCard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thẻ: ");
        String cardNumber = sc.nextLine();
        Card card = findCardByNumber(cardList,cardNumber);
        if (card == null) {
            System.out.println("Thẻ không tồn tại");
            return;
        }
        System.out.print("Nhập số tiền cần thanh toán: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        if (card instanceof ATMCard) {
            ATMCard atmCard = (ATMCard) card;
            double newBalance = atmCard.getBalance() - amount;
            if (newBalance < 0) {
                System.out.println("Số dư không đủ để thanh toán");
                return;
            }
            atmCard.setBalance(newBalance);
            System.out.println("Thanh toán thành công, số dư mới: " + newBalance);
        } else if (card instanceof CreditCard) {
            CreditCard creditCard = (CreditCard) card;
            double newAmount = creditCard.getAmount() + amount;
            if (newAmount > creditCard.getLimit()) {
                System.out.println("Số tiền sử dụng vượt quá hạn mức");
                return;
            }
            creditCard.setAmount(newAmount);
            System.out.println("Thanh toán thành công, số tiền sử dụng mới: " + newAmount);
        }
    }








}
