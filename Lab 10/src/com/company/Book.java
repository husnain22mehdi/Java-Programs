package com.company;

//Creating class Book
public class Book {

    //Declaring fields
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    //Defining the three parameter constructor
    Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    //Defining the four parameter constructor
    Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    //Name Getter
    public String getName(){
        return name;
    }
    //Author Getter
    public Author getAuthor(){
        return author;
    }
    //Price Getter
    public double getPrice(){
        return price;
    }
    //Price Setter
    public void setPrice(double price){
        this.price = price;
    }
    //Stock Setter
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    //Stock Getter
    public int getQtyInStock(){
        return qtyInStock;
    }
    public String toString(){
        return "Name of Book: " + name + "\n" + "Name of Author: " +
                author + "\n" + "Price of Book: " +
                price + "\n" + "Quantity in Stock: " + qtyInStock;
    }
}
