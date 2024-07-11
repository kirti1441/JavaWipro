import java.util.Scanner;

interface Product {
    void productDetails();
    void showProduct();
}

class Electronics implements Product {
    String name;
    double price;
    int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        this.name = name;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void productDetails() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Warranty Period: " + warrantyPeriod + " months");
    }

    @Override
    public void showProduct() {
        productDetails();
    }
}

class Furniture implements Product {
    String name;
    double price;
    String material;

    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    @Override
    public void productDetails() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Material: " + material);
    }

    @Override
    public void showProduct() {
        productDetails();
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Electronics Details:");
        System.out.print("Name: ");
        String eName = sc.nextLine();
        System.out.print("Price: $");
        double ePrice = sc.nextDouble();
        System.out.print("Warranty Period (months): ");
        int eWarranty = sc.nextInt();
        sc.nextLine(); 
        
        Electronics electronics = new Electronics(eName, ePrice, eWarranty);

        System.out.println("\nEnter Furniture Details:");
        System.out.print("Name: ");
        String fName = sc.nextLine();
        System.out.print("Price: $");
        double fPrice = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Material: ");
        String fMaterial = sc.nextLine();

        Furniture furniture = new Furniture(fName, fPrice, fMaterial);

        System.out.println("\n--- Product Details ---");
        electronics.showProduct();
        furniture.showProduct();
    }
}
