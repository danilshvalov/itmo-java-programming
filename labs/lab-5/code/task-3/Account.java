import java.util.Scanner;
import java.io.InputStream;


public class Account {
    private String firstName;
    private String lastName;
    private double money;

    Account(String firstName, String lastName, double money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public double getMoney() {
      return money;
    }

    public void setMoney(double money) {
      this.money = money;
    }

    public static Account read(InputStream input) {
        Scanner scanner = new Scanner(input);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter money: ");
        double money = scanner.nextDouble();
        return new Account(firstName, lastName, money);
    }

    public static Account read() {
        return read(System.in);
    }
}
