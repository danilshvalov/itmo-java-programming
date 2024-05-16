/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplebankapp;

/**
 *
 * @author Daniil Shvalov
 */
public class SimpleBankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account account = new Account(1, 150);
        ATM.out(account);
        account.deposite(250);
        System.out.println("Deposit 250");
        ATM.out(account);
        account.withdraw(100);
        System.out.println("Withdraw 100");
        ATM.out(account);
    }
}
