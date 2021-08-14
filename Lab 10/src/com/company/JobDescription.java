package com.company;

//Creating class JobDescription
public class JobDescription {
    //Defining fields
    String designation;
    int salary;
    String teaching_load;

    //Defining the constructor
    JobDescription(String designation, int salary, String teaching_load){
        this.designation = designation;
        this.salary = salary;
        this.teaching_load = teaching_load;
    }

    //Modifying the toString method
    public String toString(){
        return "Designation = " + designation + "\n" + "Salary = " + salary + "\n" +
                "Teaching Load = " + teaching_load;
    }
}
