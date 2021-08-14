package com.company;

//Defining the child class Monkey
public class Monkey extends LivingThing{

    //Defining the constructor
    Monkey(String name){
        super(name);
    }

    //Defining the abstract mehtod
    public void walk(){
        System.out.println("Monkey " + this.getName() + " walking....");
    }

}
