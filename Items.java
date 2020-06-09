/*
Authors: 
Date: Jun 10, 2020
Assignment: MidPoint Deliverable
Purpose: Item Class for products purchased by customers 
 */
package Capstone;

public class Items {
    
    private int itemSKU;
    private String itemName;
    private int quantity;
    private double price;
    private boolean itemSold;
    
    public static int nextItemID = 100;
    
    public Items(String itemName, int quantity, double price, boolean itemSold) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.itemSold = itemSold;
        
        itemSKU = nextItemID;
        nextItemID++;
        
    }
    
    //Setter Methods
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setItemSold(boolean itemSold) {
        this.itemSold = itemSold;
    }
    
    //Getter Methods
    public String getItemName() {
        return this.itemName;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public double getPrice() {
        return this.price;
    }
    public boolean getItemSold() {
        return this.itemSold;
    }
    
    //The act of selling an item -> WILL CHANGE FOR TRANSACTION
    public boolean sellItem() {
        if (itemSold == true) {
            return true;
        }
        return false;
    }
    
    //toString for an item 
    public String toString() {
        String returnString = "";
        returnString += "ItemID: " + this.itemSKU + " Name: " + this.getItemName()
                + " Quantity: " + this.getQuantity() + " Price: " + this.getPrice()
                + " Sold: " + this.getItemSold();
        
        return returnString;
    }
}
