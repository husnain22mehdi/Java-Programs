package com.company;

//Creating sub class Rectangle of Geometric class
public class Rectangle extends GeometricObject{
    //Declaring fields
    double width = 1.0;
    double height = 1.0;

    //Defining the no arg constructor
    Rectangle(){
    }
    //Defining the dual parameterized constructor
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    //Defining the 4-parameter parameterized constructor
    Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    //Width Setter
    public void setWidth(double width){
        this.width = width;
    }
    //Width Getter
    public double getWidth(){
        return width;
    }
    //Height Setter
    public void setHeight(double height){
        this.height = height;
    }
    //Height Getter
    public double getHeight(){
        return height;
    }
    //Method to calculate Area
    public double getArea(){
        return width * height;
    }
    //Method to calculate Perimeter
    public double getPerimeter(){
        return 2 * (width * height);
    }
    public String toString(){
        return "Rectangle: width = " + width + " height = " + height;
    }
}
