package com.company;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        int num_1;
        int num_2;
        String option;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num_1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num_2 = sc.nextInt();

        System.out.println();
        System.out.print("Choose operation (+,-,*,/): ");
        option = sc.next();
        System.out.println();

        switch (option) {
            case "Addition" -> System.out.printf("%d + %d = %d", num_1, num_2, num_1 + num_2);
            case "Subtraction" -> System.out.printf("%d - %d = %d", num_1, num_2, num_1 - num_2);
            case "Multiplication" -> System.out.printf("%d * %d  = %d", num_1, num_2, num_1 * num_2);
            case "Division" -> System.out.printf("%d / %d = %.2f", num_1, num_2, (float) num_1 / num_2);
            default -> System.out.print("Please enter a valid operation!");
        }
        sc.close();
    }
}
