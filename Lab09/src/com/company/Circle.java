package com.company;

//Creating sub class Circle of GeometricObject class
public class Circle extends GeometricObject{
    //Declaring fields
    double radius;

    //Defining the no arg constructor
    Circle(){
    }
    //Defining the single parameterized constructor
    Circle(double radius){
        this.radius = radius;
    }
    //Defining the triple parameterized constructor
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    //Radius Setter
    public void setRadius(double radius){
        this.radius = radius;
    }
    //Radius Getter
    public double getRadius(){
        return radius;
    }
    //Method for calculating Area
    public double getArea(){
        return Math.PI * radius * radius;
    }
    //Method for calculating Perimeter
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    //Method for calculating Diameter
    public double getDiameter(){
        return 2 * radius;
    }
    //Printing details of Circle
    public void printCircle(){
        System.out.println("The radius of circle is: " + radius);
        System.out.println("The area of circle is: " + getArea());
        System.out.println("The perimeter of circle is: " + getPerimeter());
    }
}
