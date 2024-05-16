import java.io.InputStream;
import java.util.Scanner;


public class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Product read(InputStream input) {
        Scanner scanner = new Scanner(input);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        return new Product(name, price);
    }

    public static Product read() {
        return read(System.in);
    }
}
