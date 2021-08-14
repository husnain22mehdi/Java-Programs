package com.company;

import java.util.Scanner;

//Creating the Test class
public class TestTask01 {

    //Main method
    public static void main(String[] args) {

        //Creating instance of Scanner class to take input
        Scanner sc = new  Scanner(System.in);

        //Taking inputs
        System.out.print("Enter the width of rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of rectangle: ");
        double height = sc.nextDouble();
        System.out.print("Enter the color of rectangle: ");
        String color = sc.next();
        System.out.print("Enter whether the rectangle is filled or not: ");
        boolean filled = sc.nextBoolean();

        //Creating object of Rectangle class
        Rectangle rect = new Rectangle();
        rect.setColor(color);   //Setting color
        rect.setFilled(filled); //Setting filled
        rect.setWidth(width);   //Setting width
        rect.setHeight(height); //Setting height

        System.out.println();

        //Printing required outputs
        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter());
        System.out.println("Color of Rectangle: " + rect.getColor());
        System.out.println("Rectangle is filled: " + rect.isFilled());

    }
}
