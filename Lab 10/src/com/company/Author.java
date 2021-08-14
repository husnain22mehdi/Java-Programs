package com.company;

//Creating class Author
public class Author {

    //Declaring fields
    private String name;
    private String email;
    private char gender;

    //Defining the constructor
    Author(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

}
