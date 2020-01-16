package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(itemDescription, menuItem.itemDescription) &&
                Objects.equals(itemCategory, menuItem.itemCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemDescription, itemCategory);
    }
}
