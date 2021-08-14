package com.company;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        //Declaring variables
        float x;
        float part_1;
        float part_2;
        float part_3;
        float part_4;
        float part_5;

        Scanner sc = new Scanner(System.in);

        System.out.println("The expression to compute is: ");
        System.out.println("y = 12.3x^4 - 9.1x^3 + 19.3x^2 - 4.6x + 34.2\n");

        //Taking Input
        System.out.print("Enter a real number: ");
        x = sc.nextFloat();

        //Breaking the expression into parts and calculating the value of each
        part_1 = (float) ((12.3) * (Math.pow(x, 4)));
        part_2 = (float) ((9.1) * (Math.pow(x, 3)));
        part_3 = (float) ((19.3) * (Math.pow(x, 2)));
        part_4 = (float) (4.6 * x);
        part_5 = 34.2F;

        //Printing Output
        System.out.println("The value of 'y' is " + (part_1 - part_2 + part_3 - part_4 + part_5) + " when x = " + x);
    }
}
