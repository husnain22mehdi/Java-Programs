package com.company;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        int num;
        int first_digit;
        int second_digit;
        int third_digit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        num = sc.nextInt();

        first_digit = num / 100;
        second_digit = (num % 100) / 10;
        third_digit = (num % 100) % 10;

        System.out.println("The sum of the product of its digits is " + (first_digit * second_digit * third_digit));
        sc.close();
    }
}
