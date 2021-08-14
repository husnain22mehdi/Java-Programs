package com.company;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //Declaring and initializing array
        int [] num_array = new int [10];
        //Declaring 'num' variable
        int num;

        Scanner sc = new Scanner(System.in);

        //For loop for taking all inputs
        for (int i = 0; i < 10; i++){

            System.out.printf("Enter Num %d: ", i+1);
            num =  sc.nextInt();

            //Checking for duplicate numbers
            for (int integer : num_array) {

                if (num == integer) {
                    System.out.println("Invalid Entry!");
                    i--;
                    break;
                }
            }
            //Storing value in array if it is not a duplicate number
            num_array[i] = num;

        }
    }
}
