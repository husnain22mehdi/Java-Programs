package com.company;

//Creating Test class
public class TestTask02 {

    //Main Method
    public static void main(String[] args) {

        //Printing info of Person class
        System.out.println("Class PERSON");
        System.out.println("------------");
        Person person = new Person("Muhammad Zafar","3740667889093","mzafar001@gmail.com","0345-5535975");
        System.out.println(person);

        System.out.println();

        //Printing info of Student class
        System.out.println("Class STUDENT");
        System.out.println("-------------");
        Student student = new Student("Abdullah","3423946773486","ab123@hmail.com","0321-1826497",2020,339284);
        System.out.println(student);

        System.out.println();

        //printing info of Faculty class
        System.out.println("Class FACULTY");
        System.out.println("-------------");
        Faculty faculty = new Faculty("Zain","3826856298746","zain23@yahoo.com","0311-7395752","051-9732936",new JobDescription("Professor",300000,"6 courses per year"),new HiringDate(12,3,2011));
        System.out.println(faculty);

    }
}
