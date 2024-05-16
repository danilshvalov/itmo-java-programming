/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shirtapplication;

/**
 *
 * @author danilshvalov
 */
public class Shirt {

    private int shirtID;
    private String description;
    private char colorCode;
    private double price;
    private int quantityInStock;

    public Shirt() {
        this.shirtID = 0;
        this.description = "description";
        this.colorCode = 'U';
        this.price = 0;
        this.quantityInStock = 0;
    }
    
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
