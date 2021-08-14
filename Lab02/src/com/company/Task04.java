package com.company;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //Declaring variables
        float S;
        float So;
        float Vo;
        float a;
        float t;
        float part_1;
        float part_2;
        float part_3;

        Scanner sc = new Scanner(System.in);

        System.out.println("The expression to compute is: ");
        System.out.println("S = So + Vot + (1/2)at^2\n");

        //Taking Input
        System.out.print("Initial Position (So): ");
        So = sc.nextFloat();
        System.out.print("Initial velocity (Vo): ");
        Vo = sc.nextFloat();
        System.out.print("Time (t): ");
        t = sc.nextFloat();
        System.out.print("Acceleration (a): ");
        a = sc.nextFloat();
        System.out.println();

        //Breaking the expression into parts and calculating the value of each
        part_1 = So;
        part_2 = Vo;
        part_3 = (float) ((0.5) * a * (Math.pow(t, 2)));

        S = (part_1 + part_2 + part_3);

        //Printing Output
        System.out.println("The value of 'S' is " + S + " meter(s).");
        sc.close();
    }
}
