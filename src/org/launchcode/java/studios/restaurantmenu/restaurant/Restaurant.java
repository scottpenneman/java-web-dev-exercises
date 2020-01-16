package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

//        Testing
//        // Create an ArrayList to store MenuItems
//        Menu.menu.add(new MenuItem(19.99, "Onion Rings", "Appetizer", false));
//        menu.add(new MenuItem(199.99, "Pizza", "Main", true));

        MenuItem item1 = new MenuItem(19.99, "Steak", "Dinner", true);
        MenuItem item2 = new MenuItem(35.99, "Mac and Cheese", "Dinner", false);
        MenuItem item3 = new MenuItem(40.99, "Beans", "Appetizer", false);
        MenuItem item4 = new MenuItem(19.99, "Steak", "Dinner", true);

        Date today = Calendar.getInstance().getTime();

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(startingMenu, today);

        // Add four items to the menu
        ourMenu.addMenuItem(item1);
        ourMenu.addMenuItem(item2);
        ourMenu.addMenuItem(item3);
        ourMenu.addMenuItem(item4);

        // Print menu of four items
        ourMenu.printMenu();

        // Remove item at index 0
        ourMenu.removeMenuItem(0);

        // Print menu, now item 0 is gone
        ourMenu.printMenu();

        System.out.println(ourMenu.dateLastUpdated());

        ourMenu.setLastUpdated(Calendar.getInstance().getTime());

        // Does item1 equal item4?
        System.out.println(item1.equals(item4));

        // Does item2 equal item4?
        System.out.println(item2.equals(item4));

    }

}