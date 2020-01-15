package org.launchcode.java.studios.restaurantmenu.restaurant;

public class MenuItem {

    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean itemStatus;

    public MenuItem(double itemPrice, String itemDescription, String itemCategory, boolean itemStatus) {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemStatus = itemStatus;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) { this.itemPrice = itemPrice; }

    public String getItemDescription() { return itemDescription; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public String getItemCategory() {
        return itemCategory;
    }
    public void setItemCategory(String itemCategory) { this.itemCategory = itemCategory; }

    public boolean getItemStatus() {
        return itemStatus;
    }
    public void setItemStatus(boolean itemStatus) { this.itemStatus = itemStatus; }

}
