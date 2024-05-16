import java.util.ArrayList;
import java.util.List;


public class Deal {
    private Account seller;
    private Account buyer;
    private List<ProductEntry> products;

    Deal(Account seller, Account buyer) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product, int count) {
        products.add(new ProductEntry(product, count));
    }

    List<ProductEntry> getProducts() { return products; }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ProductEntry product : products) {
            totalPrice += product.getTotalPrice();
        }
        return totalPrice;
    }

    public void close() {
        double totalPrice = getTotalPrice();
        if (buyer.getMoney() < totalPrice) {
            throw new IllegalArgumentException(
                "Buyer has not enough money: " + buyer.getMoney() + " < " +
                totalPrice);
        }
        buyer.setMoney(buyer.getMoney() - totalPrice);
        seller.setMoney(seller.getMoney() + totalPrice);
        products.clear();
    }
}
