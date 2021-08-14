package com.company;
import java.util.Scanner;

public class ClassAssignment01 {

    public static void main(String[] args) {

        //Declaring variables
        String name;
        char gender;
        int age;
        long mob_no;
        double cgpa;

        Scanner sc = new Scanner(System.in);

        //Taking Inputs
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your gender: ");
        gender = sc.next().charAt(0);

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your mobile number: ");
        mob_no = sc.nextLong();

        System.out.print("Enter your cgpa: ");
        cgpa = sc.nextDouble();

        System.out.println();

        //Printing Output
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mob_no);
        System.out.println("CGPA: " + cgpa);
        sc.close();

    }
}
