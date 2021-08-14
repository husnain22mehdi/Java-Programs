package com.company;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //Declaring required variables for the program
        int num;
        int first_digit;
        int second_digit;
        int third_digit;
        int forth_digit;
        int fifth_digit;

        Scanner sc = new Scanner(System.in);

        //Taking Input
        System.out.print("Enter a five digit number: ");
        num = sc.nextInt();

        //Calculating every digit
        first_digit = (num / 10000);
        second_digit = ((num % 10000) / 1000);
        third_digit = (((num % 10000) % 1000) / 100);
        forth_digit = ((((num % 10000) % 1000) % 100) / 10);
        fifth_digit = ((((num % 10000) % 1000) % 100) % 10);

        //Printing Output
        System.out.printf("%d   %d   %d   %d   %d", first_digit, second_digit, third_digit, forth_digit, fifth_digit);
        sc.close();

    }
}
