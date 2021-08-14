package com.company;

import java.util.Scanner;

public class Question05 {

    public static void main(String[] args) {

        int units;
        float temp_bill = 0;
        float total_bill;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units: ");
        units = sc.nextInt();
        System.out.println();

        if (units <= 100){
            temp_bill = 4.0F * units;
        }if (units > 100 && units <= 300){
            temp_bill = 4.5F * units;
        }if (units > 300 && units <= 500){
            temp_bill = 4.75F * units;
        }if (units > 500){
            temp_bill = 5.0F * units;
        }
        total_bill = (temp_bill * 0.2F) + (temp_bill * 0.1F) + temp_bill;
        System.out.println("Total Bill = Rs." + total_bill);
        sc.close();
    }
}
