package com.company;

//Creating the abstract class
public abstract class Product {
    //Defining fields
    private double regularPrice;

    //Defining the constructor
    Product(double regularPrice){
        this.regularPrice = regularPrice;
    }
    //Defining the required methods
    public abstract double computeSalePrice();      //Abstract method
    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }
    public double getRegularPrice(){
        return regularPrice;
    }
}
