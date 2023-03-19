package io_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductController   {
    List<Product> products =new ArrayList<>();
    Scanner sc= new Scanner(System.in);


    public void displayProduct(){
        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i).toString());
        }
    }
    public void addProduct(){
        System.out.println("Enter id :");
        String id=sc.nextLine();
        System.out.println("Enter name of product: ");
        String name =sc.nextLine();
        System.out.println("Enter manufacturer: ");
        String manu= sc.nextLine();
        System.out.println("Enter price: ");
        int cost= sc.nextInt();
        sc.nextLine();
        Product newProduct=  new Product(id,name,manu,cost);
        products.add(newProduct);
        System.out.println("Added !");

    }
    public void findProduct(){
        System.out.println("Enter id");
        String id=sc.nextLine();
        for (int i = 0; i < products.size() ; i++) {
               if(products.get(i).getId().equals(id)){
                   System.out.println(products.get(i).toString());
               }
        }
    }
    public static void writeObject(String path, List<Product> list) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
            stream.writeObject(list);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFileObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))){
            return (List<Product>)stream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        ProductController productController=new ProductController();
        productController.addProduct();
        productController.writeObject(".\\io_binary_file\\product.txt",productController.products);


    }


}
