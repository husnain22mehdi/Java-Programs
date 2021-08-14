package com.company;

import java.util.Scanner;

//Creating our own class Date
class Date{
    //Declaring fields
    int month;
    int day;
    int year;

    //Constructor for initializing the variables
    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }
    //Method to display date to the console
    public void displayDate(){
        System.out.printf("%d/%d/%d", month, day, year);
    }
}

public class Task03 {

    //Main method
    public static void main(String[] args) {

        //Creating an object of Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        //Creating an object of Date class
        Date today = new Date(month, day, year);
        //Printing the date
        today.displayDate();


    }
}
