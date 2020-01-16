package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItem> items, Date dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

    public void addMenuItem(MenuItem MenuItem) {
            this.items.add(MenuItem);
    }

    public void printMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("\n*****");
            System.out.println("Menu Item: " + items.get(i).getItemDescription());
            System.out.println("Price: " + items.get(i).getItemPrice());
            System.out.println("Category: " + items.get(i).getItemCategory());
            if (items.get(i).getItemStatus()) {
                System.out.println("Check out this new item!");
            }
            System.out.println("*****");
        }
    }

    public void printMenuItem(int index) {
        System.out.println("\n*****");
        System.out.println("Menu Item: " + items.get(index).getItemDescription());
        System.out.println("Price: " + items.get(index).getItemPrice());
        System.out.println("Category: " + items.get(index).getItemCategory());
        if (items.get(index).getItemStatus()) {
            System.out.println("Check out this new item!");
        }
        System.out.println("*****");
    }

    public void removeMenuItem(int itemIndex) {
        items.remove(itemIndex);
    }

    public Date dateLastUpdated() {
        return dateUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.dateUpdated = lastUpdated;
    }



}