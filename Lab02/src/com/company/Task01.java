package com.company;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Declaring variables
        String year;
        int courses;
        float gpa;

        Scanner sc = new Scanner(System.in);

        //Taking Inputs
        System.out.print("Enter year of student (Freshman/Sophomore/Junior/Senior): ");
        year = sc.nextLine();

        System.out.print("Number of courses taking: ");
        courses = sc.nextInt();

        System.out.print("Enter the GPA of student (4.0 scale): ");
        gpa = sc.nextFloat();
        System.out.println();

        //Printing Outputs
        System.out.println("The student is a " + year);
        System.out.println("The student is taking  " + courses + " courses");
        System.out.println("The GPA of the student is " + gpa);
        sc.close();
    }
}
