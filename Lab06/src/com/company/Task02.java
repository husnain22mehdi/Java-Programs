package com.company;

import java.util.Scanner;

//Creating our own class Employee
class Employee{
    //Declaring fields
    String first_name;
    String last_name;
    double monthly_salary;

    //Constructor for initializing the variables
    public Employee(String f_n, String l_n, double m_s){
        first_name = f_n;
        last_name = l_n;
        monthly_salary = m_s;

        if (monthly_salary < 0){
            monthly_salary = 0;
        }
    }
    //Method to calculate yearly salary
    public double yearlySalary(){
        return monthly_salary * 12;
    }
    //Method to calculate 10% raise in salary
    public double bonus(){
        return monthly_salary * 0.1;
    }
}

public class Task02 {

    //Main method
    public static void main(String[] args) {

        //Creating an object of Scanner class to take inputs
        Scanner sc = new Scanner(System.in);

        //Taking the inputs for employee 1
        System.out.println("EMPLOYEE 01");
        System.out.println("-----------");
        System.out.print("Enter first name of employee1: ");
        String first_name_1 = sc.next();
        System.out.print("Enter last name of employee1: ");
        String last_name_1 = sc.next();
        System.out.print("Enter monthly salary of employee1: ");
        double monthly_salary_1 = sc.nextDouble();

        //Creating an object of Employee class
        Employee person1 = new Employee(first_name_1, last_name_1, monthly_salary_1);
        //Printing required outputs
        System.out.printf("%s's yearly salary = %.1f\n", person1.first_name, person1.yearlySalary());
        System.out.printf("%s's yearly salary after 10 percent raise = %.1f\n", person1.first_name, (person1.yearlySalary() + (12 * person1.bonus())));

        System.out.println();

        //Taking inputs for employee 2
        System.out.println("EMPLOYEE 02");
        System.out.println("-----------");
        System.out.print("Enter first name of employee2: ");
        String first_name_2 = sc.next();
        System.out.print("Enter last name of employee2: ");
        String last_name_2 = sc.next();
        System.out.print("Enter monthly salary of employee2: ");
        double monthly_salary_2 = sc.nextDouble();

        //Making another object of Employee class
        Employee person2 = new Employee(first_name_2, last_name_2, monthly_salary_2);
        //Printing required outputs
        System.out.printf("%s's yearly salary = %.1f\n", person2.first_name, person2.yearlySalary());
        System.out.printf("%s's yearly salary after 10 percent raise = %.1f\n", person2.first_name, (person2.yearlySalary() + (12 * person2.bonus())));
    }
}
