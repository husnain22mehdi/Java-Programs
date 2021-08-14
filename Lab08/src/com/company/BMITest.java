package com.company;

import java.util.Scanner;

//Creating the test class BMITest
public class BMITest {

    //Main method
    public static void main(String[] args) {

        //Creating an object of Scanner class to take input
        Scanner sc = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter your weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = sc.nextDouble();

        //Creating an object of BMI class
        BMI person = new BMI();
        //Setting weight of person
        person.setWeight(weight);
        //Setting height of person
        person.setHeight(height);

        //Getting BMI of person
        double person_bmi = person.getBMI();
        System.out.println();
        //Printing BMI
        System.out.printf("Your BMI is: %.2f\n", person_bmi);
        //Printing status of person
        System.out.println("Your status is: " + person.getStatus(person_bmi));
    }
}