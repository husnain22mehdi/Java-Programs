package com.company;

//Creating Test class
public class StudentTest {

    //Main method
    public static void main(String[] args) {

        //Creating 7 objects of Student class i.e., 7 students and setting their information
        Student s1 = new Student();
        s1.setId(1000);
        s1.setMarks(75);

        Student s2 = new Student();
        s2.setId(1001);
        s2.setMarks(82);

        Student s3 = new Student();
        s3.setId(1002);
        s3.setMarks(94);

        Student s4 = new Student();
        s4.setId(1003);
        s4.setMarks(77);

        Student s5 = new Student();
        s5.setId(1004);
        s5.setMarks(88);

        Student s6 = new Student();
        s6.setId(1005);
        s6.setMarks(67);

        Student s7 = new Student();
        s7.setId(1006);
        s7.setMarks(74);

        //Creating an array of objects
        Student [] studentArray = {s1, s2, s3, s4, s5, s6, s7};

        System.out.println("Student ID\t\tMarks Obtained");
        System.out.println("----------\t\t--------------");
        //Loop for printing each students information and also calculating total marks
        int total_marks = 0;
        for (Student i : studentArray){
            System.out.printf("%d\t\t\t\t%d\n", i.getId(), i.getMarks());
            total_marks += i.getMarks();
        }
        //Printing the average of all marks of students
        System.out.println();
        System.out.printf("The average marks of all students are %.2f", total_marks / 7.0);
    }
}
