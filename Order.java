import java.util.Scanner;
import java.sql.Date;
 
frame.add(datePicker);

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product[] products = {new Product("Water", 10), new Product("Bleach", 20), 
                              new Product("Pool Pump", 30), new Product("Pool Hose", 40)};

        System.out.println("Select a product:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i].getName() + " - $" + products[i].getPrice());
        }

        int productIndex = input.nextInt();
        Product selectedProduct = products[productIndex-1];

        System.out.print("Enter quantity: ");
        double quantity = input.nextInt();

        System.out.print("Enter delivery date (yyyy-MM-dd): ");
        String deliveryDateString = input.next();
        Date deliveryDate = Date.valueOf(deliveryDateString);

      System.out.println("Order placed for " + quantity + " units of " + selectedProduct.getName() 
                           + " with delivery date " + deliveryDate + " Total cost: $" + 
                           selectedProduct.getPrice()*1.0*quantity + " \nThank you for shopping with us!");
    }
}
