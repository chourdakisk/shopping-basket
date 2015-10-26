/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingbasket;

/**
 *
 * @author konstantinoschourdakis
 */
public class Item {
    
    private String itemName;
    private float price;

    public Item(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    // Getter and Setter methods
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // End of Setter and Getter Methods
    
    
    
    
    
}
