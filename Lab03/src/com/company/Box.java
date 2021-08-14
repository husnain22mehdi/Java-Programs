package com.company;

public class Box {

    double length;
    double breadth;
    double height;

    public static void main(String[] args) {

        double vol_box_1;
        double vol_box_2;

        Box box_1 = new Box();
        Box box_2 = new Box();

        box_1.length = 6.0;
        box_1.breadth = 4.0;
        box_1.height = 5.0;

        box_2.length = 4.0;
        box_2.breadth = 2.0;
        box_2.height = 3.0;

        vol_box_1 = box_1.calculateVolume();
        vol_box_2 = box_2.calculateVolume();

        System.out.println("The volume of Box 1 is: " + vol_box_1);
        System.out.println("The volume of Box 2 is: " + vol_box_2);
    }
    public double calculateVolume(){

        double volume = length * breadth * height;
        return volume;
    }
}
