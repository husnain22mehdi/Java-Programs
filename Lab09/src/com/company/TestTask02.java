package com.company;

//Creating the Test class
public class TestTask02 {

    //Main method
    public static void main(String[] args) {

        //Invoking toString method for each object of every class
        Person person = new Person();
        person.toString();

        System.out.println();

        Student student = new Student();
        student.toString();

        System.out.println();

        Employee employee = new Employee();
        employee.toString();

        System.out.println();

        Faculty faculty = new Faculty();
        faculty.toString();

        System.out.println();

        Staff staff = new Staff();
        staff.toString();
    }
}
