package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public static void main(String[] args) {

        ArrayList<MenuItem> menu = new ArrayList<>();
        Date dateUpdated = new Date();

        // Create an ArrayList to store MenuItems
        menu.add(new MenuItem(19.99, "Onion Rings", "Appetizer", false));
        menu.add(new MenuItem(199.99, "Pizza", "Main", true));

        System.out.println("Anytime this is run, dateUpdated is updated to the current date, most recently: " + dateUpdated);

        // Describe the items in the ArrayList
        for (int i = 0; i < menu.size(); i++) {
            System.out.println("\n*****");
            System.out.println("Menu Item: " + menu.get(i).getItemDescription());
            System.out.println("Price: " + menu.get(i).getItemPrice());
            System.out.println("Category: " + menu.get(i).getItemCategory());
            if (menu.get(i).getItemStatus()) {
                System.out.println("Check out this new item!");
            }
            System.out.println("*****");
        }
    }
}
