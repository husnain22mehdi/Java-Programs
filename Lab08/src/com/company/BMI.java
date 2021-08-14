package com.company;

//Creating our own class BMI
public class BMI {
    //Declaring fields
    String name;
    int age;
    double weight;
    double height;

    //Defining the no-arg constructor
    BMI(){
    }
    //Defining the 4-parameter parameterized constructor
    BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    //Defining the triple parameterized constructor
    BMI(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    //Defining the copy constructor
    BMI(BMI person){
        this.name = person.name;
        this.age = person.age;
        this.weight = person.weight;
        this.height = person.height;
    }
    //Name setter method
    public void setName(String name){this.name = name;}
    //Age setter method
    public void setAge(int age){this.age = age;}
    //Weight setter method
    public void setWeight(double weight) {this.weight = weight;}
    //Height setter method
    public void setHeight(double height){this.height = height;}

    //Age getter method
    public int getAge(){
        return age;
    }
    //Name getter method
    public String getName(){
        return name;
    }
    //Weight getter method
    public double getWeight(){
        return weight;
    }
    //Height getter method
    public double getHeight(){
        return height;
    }

    //Method for calculating BMI
    public double getBMI(){
        double weight_in_kg = weight * 0.4536;
        double height_in_meters = height * 0.0254;
        return weight_in_kg / (height_in_meters * height_in_meters);
    }

    //Method for calculating the status of person
    public String getStatus(double bmi){
        String status = "";
        if (bmi < 18.5){
            status = "Underweight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            status = "Normal";
        }
        else if (bmi >= 25 && bmi <= 29.9){
            status = "Overweight";
        }
        else if (bmi >= 30){
            status = "Obese";
        }
        return status;
    }

}
