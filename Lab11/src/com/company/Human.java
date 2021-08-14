package com.company;

//Defining the child class Human
public class Human extends LivingThing{

    //Defining the constructor
    Human(String name){
        super(name);
    }

    //Defining the abstract method
    public void walk(){
        System.out.println("Human " + this.getName() + " walking....");
    }
}
