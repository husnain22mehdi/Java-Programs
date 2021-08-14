package com.company;

//Creating sub class Employee of Person class
public class Employee extends Person{
    //Declaring fields
    String office;
    int salary;
    String date_hired;


    //Method to print class name and person name
    public String toString(){
        System.out.println("Class Name: Employee");
        System.out.println("Person Name: Ahmed");
        return null;
    }
}
