package java_collection_framework;

import java.util.*;

public class ProductManager {
    List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter manufacturer: ");
        String manu = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, manu, price);
        productList.add(product);
    }

    public void edit() {
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        Product product = null;

        for (Product key : productList) {
            if (key.getId().equals(id)) {
                product = key;
                break;
            }
        }

        if (product == null) {
            System.out.println("Product doesn't exist. ");
            return;
        }
        System.out.println("Enter product name (or leave blank to keep current value: " + product.getName() + ")");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            product.setName(name);
        }

        System.out.println("Enter product manufacturer (or leave blank to keep current value: " + product.getManufacturer() + ")");
        String manu = scanner.nextLine();
        if (!name.isEmpty()) {
            product.setManufacturer(manu);
        }

        System.out.println("Enter product manufacturer (or leave blank to keep current value: " + product.getManufacturer() + ")");
        double price = Double.parseDouble(scanner.nextLine());
        if (!name.isEmpty()) {
            product.setPrice(price);
        }
        System.out.println("Updated!");
    }

    public void delete(){
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        Product product = null;

        for (Product key : productList) {
            if (key.getId().equals(id)) {
                product = key;
                break;
            }
        }
        if (product == null) {
            System.out.println("Product with id: " + id + " does not exist.");
        } else {
            productList.remove(product);
            System.out.println("Product with id: " + id + " has been deleted.");
        }

    }

    public void display(){
        for(Product product:productList){
            System.out.println(product.toString());
        }
    }

    public void search(){
        System.out.println("Enter name product: ");
        String name=scanner.nextLine();

        List<Product> searchProduct=new ArrayList<>();
        for(Product product: productList){
            if(product.getName().equals(name)){
                searchProduct.add(product);
            }
        }

        if(searchProduct.isEmpty()){
            System.out.println("No matching results! ");
        } else {
            System.out.println("Search results: ");
            for(Product product:searchProduct){
                System.out.println(product.toString());
            }
        }

    }

  public void sortProduct(){
      Collections.sort(productList, Comparator.comparing(Product::getPrice));

  }


}
