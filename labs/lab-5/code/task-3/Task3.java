import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter seller information");
        Account seller = Account.read();
        System.out.println("Enter buyer information");
        Account buyer = Account.read();

        Deal deal = new Deal(seller, buyer);

        System.out.print("Enter number of product types: ");
        Scanner scanner = new Scanner(System.in);
        int productItemsCount = scanner.nextInt();
        for (int i = 0; i < productItemsCount; ++i) {
            Product product = Product.read();
            System.out.print("Enter count: ");
            int count = scanner.nextInt();
            deal.addProduct(product, count);
        }

        deal.close();

        System.out.println("Seller money: " + seller.getMoney());
        System.out.println("Buyer money: " + buyer.getMoney());
    }
}
