package com.company;

//Creating our own class Student
public class Student {
    //Declaring fields
    private int id;
    private int marks;

    //Method for setting student Id
    public void setId(int number) {
        id = number;
    }
    //Method for getting student Id
    public int getId() {
        return id;
    }
    //Method for setting student marks
    public void setMarks(int score) {
        marks = score;
    }
    //Method for getting student marks
    public int getMarks() {
        return marks;
    }
}

