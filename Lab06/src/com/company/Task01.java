package com.company;

//Creating our own class Rectangle
class Rectangle{
    //Declaring fields
    double width = 1;
    double height = 1;

    //Constructor for creating default rectangle
    public Rectangle(){

    }
    //Constructor for initializing the variables
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    //Method for calculating the area of rectangle
    public double getArea(double width, double height){
        return width * height;
    }
    //Method for calculating the perimeter of rectangle
    public double getPerimeter(double width, double height){
        return 2 * (width + height);
    }
}

public class Task01 {

    //Main method
    public static void main(String[] args) {

        //Data of rectangle 1
        System.out.println("RECTANGLE 01");
        System.out.println("------------");
        //Creating an object of Rectangle class
        Rectangle r1 = new Rectangle(4,40);
        //Displaying required outputs
        System.out.println("Width R1 = " + r1.width);
        System.out.println("Height R1 = " + r1.height);
        System.out.println("Area of R1 = " + r1.getArea(4,40));
        System.out.println("Perimeter of R1 = " + r1.getPerimeter(4,40));

        System.out.println();

        //Data of rectangle 2
        System.out.println("RECTANGLE 02");
        System.out.println("------------");
        //Creating another object of Rectangle class
        Rectangle r2 = new Rectangle(3.5,35.9);
        //Printing required outputs
        System.out.println("Width of R2 = " + r2.width);
        System.out.println("Height of R2 = " + r2.height);
        System.out.println("Area of R2 = " + r2.getArea(3.5,35.9));
        System.out.println("Perimeter of R2 = " + r2.getPerimeter(3.5,35.9));

    }
}
