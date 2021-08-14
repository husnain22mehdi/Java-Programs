package com.company;

//Creating the test class Time2Test
public class Time2Test {

    //Main method
    public static void main(String[] args) {

        //Creating object for the validation of next minute incrementation
        System.out.println("Validating Next Minute Increment");
        System.out.println("--------------------------------");
        Time2 time1 = new Time2();
        //Setting time
        time1.setTime(11,34,59);
        //Displaying input time
        System.out.println("Input Universal Time: 11:34:59");
        System.out.println("Input Standard Time: 11:34:59 AM");
        //Incrementing second by one
        time1.incrementSecond();
        System.out.println("After incrementing,");
        //Printing output in universal form
        System.out.println("Universal Time: " + time1.toUniversalString());
        //Printing output in standard form
        System.out.println("Standard Time: " + time1.toString());

        System.out.println();

        //Creating an object for the validation of next hour incrementation
        System.out.println("Validating Next Hour Increment");
        System.out.println("--------------------------------");
        Time2 time2 = new Time2();
        //Setting time
        time2.setTime(11,59,59);
        //Displaying input time
        System.out.println("Input Universal Time: 11:59:59");
        System.out.println("Input Standard Time: 11:59:59 AM");
        //Incrementing second by one
        time2.incrementSecond();
        System.out.println("After incrementing,");
        //Printing output in universal form
        System.out.println("Universal Time: " + time2.toUniversalString());
        //Printing output in standard from
        System.out.println("Standard Time: " + time2.toString());

        System.out.println();

        //Creating an object for the validation of next day increment
        System.out.println("Validating Next Day Increment");
        System.out.println("--------------------------------");
        Time2 time3 = new Time2();
        //Setting time
        time3.setTime(23,59,59);
        //Displaying input time
        System.out.println("Input Universal Time: 23:59:59");
        System.out.println("Input Standard Time: 11:59:59 PM");
        //Incrementing second by one
        time3.incrementSecond();
        System.out.println("After incrementing,");
        //Printing output in universal form
        System.out.println("Universal Time: " + time3.toUniversalString());
        //Printing output in standard form
        System.out.println("Standard Time: " + time3.toString());
    }
}
