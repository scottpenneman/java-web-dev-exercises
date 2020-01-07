package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner (System.in);
        System.out.println("Please enter the radius of a circle:");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " +
                radius + " is: " + area);
    }

}