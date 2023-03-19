package io_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products;
    private String filename;

    public ProductManager(String filename) {
        products = new ArrayList<Product>();
        this.filename = filename;
    }

    public void addProduct(Product product) {
        products.add(product);
        saveToFile();
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Manufacturer: " + product.getManufacturer());
            System.out.println("Price: " + product.getPrice());
            System.out.println();
        }
    }

    public void searchProduct(String keyword) {
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("ID: " + product.getId());
                System.out.println("Name: " + product.getName());
                System.out.println("Manufacturer: " + product.getManufacturer());
                System.out.println("Price: " + product.getPrice());
                System.out.println();
            }
        }
    }

    private void saveToFile() {
        try {
            FileWriter fw = new FileWriter(filename);
            for (Product product : products) {
                fw.write(product.getId() + "," + product.getName() + "," + product.getManufacturer() + "," + product.getPrice() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                String manufacturer = parts[2];
                double price = Double.parseDouble(parts[3]);
                Product product = new Product(id, name, manufacturer, price);
                products.add(product);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager("product.txt");
        productManager.loadFromFile();
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Display products");
            System.out.println("3. Search products");
            System.out.println("4. Write to file ");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product manufacturer: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Product product = new Product(id, name, manufacturer, price);
                    productManager.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    productManager.displayProducts();
                    break;
                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    productManager.searchProduct(keyword);
                    break;
                case 4:
                    productManager.saveToFile();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
