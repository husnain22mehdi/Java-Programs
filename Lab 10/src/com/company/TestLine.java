package com.company;

//Creating the Test class
public class TestLine {

    //Main method
    public static void main(String[] args) {

        //Creating two objects of ConcreteLine class
        ConcreteLine line1 = new ConcreteLine(1,2,3,4);
        ConcreteLine line2 = new ConcreteLine(8,7,6,5);

        double l1 = line1.getLength();
        double l2 = line2.getLength();

        //Printing the output whether line1 is greater, smaller or equal to line2
        if (l1 > l2){
            System.out.println("Line 1 is greater than Line 2.");
        }else{
            System.out.println("Line 1 is not greater than Line 2.");
        }

        if (l1 < l2){
            System.out.println("Line 1 is less than Line 2.");
        }else{
            System.out.println("Line 1 is not less than Line 2.");
        }

        if (l1 == l2){
            System.out.println("Line 1 is equal to Line 2.");
        }else{
            System.out.println("Line 1 is not equal to Line 2.");
        }
    }
}
