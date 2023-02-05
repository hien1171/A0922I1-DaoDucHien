package java_cllection_framework;
import java.util.*;

public class ProductManager {
    private ArrayList<Product> list;

    public ProductManager() {
        this.list = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> list) {
        this.list = list;
    }

    public void addProduct(Product product) {
        this.list.add(product);
    }

    public void editProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        for (Product product : list) {
            if (product.getIdProduct().indexOf(id) >= 0) {
                System.out.print("edit name  : ");
                product.setNameProduct(sc.nextLine());
                System.out.print("edit price : ");
                product.setCostProduct(sc.nextInt());
            }
        }
    }

    public void removeProduct(String id) {
        for (Product product : list) {
            if (product.getIdProduct().indexOf(id) >= 0) {
                this.list.remove(product);
            }
        }
    }

    public void findProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name product: ");
        String name = sc.nextLine();
        for (Product product : list) {
            if (product.getNameProduct().indexOf(name) >= 0) {
                System.out.println(product);
            }
        }
    }

    public void sortProduct() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getCostProduct() < o2.getCostProduct()){
                    return -1;
                } else if (o1.getCostProduct()==o2.getCostProduct()) {
                    return 0;
                }else {
                    return 1;
                }
            }
        });
    }

    public void display() {
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }

}
