class Product {
    String productName;
    double price;
    int quantity;

    Product() {
        this("Unknown", 0.0, 0);
    }

    Product(String productName) {
        this(productName, 0.0, 0);
    }

    Product(String productName, double price) {
        this(productName, price, 0);
    }

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("Product: " + productName);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total cost: $%.2f%n", calculateTotalCost());
    }
}

public class Pratical8 {
    public static void main(String[] args) {
        Product defaultProduct = new Product();
        Product namedProduct = new Product("Notebook");
        Product pricedProduct = new Product("Pen", 1.50);
        Product completeProduct = new Product("Backpack", 35.00, 2);

        System.out.println("=== No-argument constructor ===");
        defaultProduct.displayDetails();

        System.out.println("\n=== Product name constructor ===");
        namedProduct.displayDetails();

        System.out.println("\n=== Product name and price constructor ===");
        pricedProduct.displayDetails();

        System.out.println("\n=== Constructor with all fields ===");
        completeProduct.displayDetails();
    }
}