package com.company;

//Creating abstract class
public abstract class LivingThing {
    //Declaring fields
    private String name;

    //Defining the constructor
    LivingThing(String name){
        this.name = name;
    }

    //Defining required methods
    public void breath(){
        System.out.println("Living thing breathing....");
    }
    public void eat(){
        System.out.println("Living thing eating....");
    }
    public abstract void walk();    //Abstract method
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
