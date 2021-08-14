package com.company;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        //Declaring variables
        float weight;
        float height;
        float bmi;

        Scanner sc = new Scanner(System.in);

        //Title
        System.out.println("Body Mass Index(BMI) Calculator");
        System.out.println("-------------------------------");

        //Taking Inputs
        System.out.print("Enter your weight(kg): ");
        weight = sc.nextFloat();

        System.out.print("Enter your height(m): ");
        height = sc.nextFloat();

        //Calculating BMI
        bmi = weight / (height * height);

        System.out.printf("\nBMI: %.1f.\n", bmi);

        //Checking for the status of the subject
        if (bmi < 18.5){
            System.out.println("Status: Underweight.");
        }
        else if (18.5 <= bmi && bmi <= 24.9){
            System.out.println("Status: Normal.");
        }
        else if (bmi <= 29.9 && bmi >= 25){
            System.out.println("Status: Overweight.");
        }
        else if (bmi >= 30){
            System.out.println("Status: Obese.");
        }
        sc.close();
    }
}
