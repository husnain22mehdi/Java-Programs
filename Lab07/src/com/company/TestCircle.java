package com.company;

public class TestCircle {

// Save as "TestCircle.java"

    public static void main(String[] args) {

        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.

        Circle c1 = new Circle();

        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.

        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(5,"gray");
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea());

        Circle c4 = new Circle();
        c4.setRadius(3.0);
        c4.setColor("green");
        System.out.println("The circle has radius of "
                + c4.getRadius() + " and area of " + c4.getArea() + " and color is " + c4.getColor());

        Circle c5 = new Circle();

        System.out.println("The number of objects created are " + Circle.no_of_obj);
    }
}

