package com.company;

//Defining the child abstract class Electronics
public abstract class Electronics extends Product{
    //Defining fields
    private String manufacturer;

    //Defining the constructor
    Electronics(double regularPrice, String manufacturer){
        super(regularPrice);
        this.manufacturer = manufacturer;
    }

    //Defining the required methods
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
}
