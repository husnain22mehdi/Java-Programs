package com.company;

//Defining the child class TV
public class TV extends Electronics{
    //Declaring fields
    private int size;

    //Defining the constructor
    TV(double regularPrice, String manufacturer, int size){
        super(regularPrice, manufacturer);
        this.size = size;
    }

    //Definiing required methods
    public double computeSalePrice() {      //abstract method
        return this.getRegularPrice()-((20*this.getRegularPrice())/100);
    }
}
