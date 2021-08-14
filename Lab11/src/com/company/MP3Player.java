package com.company;

//Creating the child class
public class MP3Player extends Electronics{
    //Defining fields
    private String color;

    //Defining the constructor
    MP3Player(double regularPrice, String manufacturer, String color){
        super(regularPrice, manufacturer);
        this.color = color;
    }

    //Defining the required methods
    public double computeSalePrice(){       //Abstract method
        return this.getRegularPrice()-((10*this.getRegularPrice())/100);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
