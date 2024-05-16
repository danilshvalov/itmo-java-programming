/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplebankapp;

/**
 * Объект класса <code>Account</code> имитирует банковский счет
 *
 * @author Daniil Shvalov
 * @version 0.0.1
 */
public class Account {

    private int customer;
    private double balance;

    public Account(int customer, int balance) {
        this.customer = customer;
        this.balance = balance;
    }

    /**
     * Метод <em>getBalance</em> возвращает текущий баланс пользователя
     *
     * @return Текущий баланс пользователя
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод <em>deposite</em> обеспечивает пополнение денег на счет
     *
     * @param count Количество пополняемых средств
     */
    public void deposite(double count) {
        balance += count;
    }

    /**
     * Метод <em>withdraw</em> обеспечивает снятие денег со счета
     *
     * @param count Количество снимаемых средств
     */
    public void withdraw(double count) {
        balance -= count;
    }

    /**
     * Метод <em>getCustomer</em> возвращает идентификатор пользователя
     *
     * @return Идентификатор пользователя
     */
    public int getCustomer() {
        return customer;
    }

    /**
     * Метод <em>getDetails</em> возвращает детальную информацию о
     * пользователе
     *
     * @return Детальная информация о пользователе
     */
    public String getDetails() {
        return "Client id: " + customer + ", balance: " + balance;
    }
}
