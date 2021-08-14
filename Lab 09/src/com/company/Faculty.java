package com.company;

//Creating sub class Faculty of Employee class
public class Faculty extends Employee{
    //Declaring fields
    int office_hrs;
    String rank;

    //Method to print class name and person name
    public String toString(){
        System.out.println("Class Name: Faculty");
        System.out.println("Person Name: Babar");
        return null;
    }
}
