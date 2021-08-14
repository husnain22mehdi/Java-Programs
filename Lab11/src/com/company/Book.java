package com.company;

//Defining the child class Book
public class Book extends Product{
    //Defining the fields
    private String publisher;
    private int yearPublished;

    //Defining the constructor
    Book(double regularPrice, String publisher, int yearPublished){
        super(regularPrice);
        this.publisher = publisher;
        this. yearPublished = yearPublished;
    }

    //Defining required methods
    @Override
    public double computeSalePrice() {      //Abstract method
        return this.getRegularPrice()-((50*this.getRegularPrice())/100);
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
