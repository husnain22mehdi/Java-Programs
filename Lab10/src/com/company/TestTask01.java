package com.company;

//Creating the Test class
public class TestTask01 {

    //Main Method
    public static void main(String[] args) {

        //Creating an instance of Book class and giving required inputs
        Book b1 = new Book("Wimpy Kid", new Author("Jeff Kinney"), 250, 100);

        //Printing teh details of book 1
        System.out.println(b1);

        System.out.println();

        //Creating another object of Book class and giving inputs
        Book b2 = new Book("Inception", new Author("Curtly Jones"), 315, 200);

        //Printing details of book 2
        System.out.println(b2);
    }
}
