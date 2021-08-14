package com.company;

//Creating the class HiringDate
public class HiringDate {
    //Declaring the fields
    int day;
    int month;
    int year;

    //Defining the constructor
    HiringDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Modifying the toString method
    public String toString(){
        return "Hiring Date = " + day + "/" + month + "/" + year;
    }
}
