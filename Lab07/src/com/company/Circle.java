package com.company;

public class Circle {
    // Save as "Circle.java"
    // private instance variable, not accessible from outside this //class
    private double radius;
    private String color;
    static int no_of_obj;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        radius = 1.0;
        color = "red";
        getNo_of_obj();
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        radius = r;
        color = "red";
        getNo_of_obj();
    }

    public Circle(double r, String color){
        radius = r;
        this.color = color;
        getNo_of_obj();
    }

    public void setRadius(double r){
        radius = r;
    }
    public void setColor(String c){
        color = c;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public void getNo_of_obj(){
        no_of_obj += 1;
    }
}


