package com.company;

//Creating our main class GeometricObject
public class GeometricObject {
    //Declaring fields
    String color = "white";
    boolean filled = false;
    java.util.Date date = new java.util.Date();

    //Defining the no arg constructor
    GeometricObject(){
    }
    //Defining the parameterized constructor
    GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //Color Setter
    public void setColor(String color){
        this.color = color;
    }
    //Color Getter
    public String getColor(){
        return color;
    }
    //Filled Setter
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    //Filled Getter
    public boolean isFilled(){
        return filled;
    }
    //Date Getter
    public java.util.Date getDateCreated(){
        return date;
    }
    public String toString(){
        return "Geometric Object: color = " + color + " filled = " + filled + " date = " + date;
    }
}
