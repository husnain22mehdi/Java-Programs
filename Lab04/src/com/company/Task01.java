package com.company;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        //Declaring and initializing array
        int [] num_array = new int[10];

        Scanner sc = new Scanner(System.in);

        //For loop for taking all the inputs
        for (int i = 0; i < 10; i++){

            System.out.printf("Enter Num %d: ",i+1);
            num_array[i] = sc.nextInt();

        }

        //Condition for checking odd numbers and printing them in reverse order
        for (int i = 9; i > -1; i--){

            if (num_array[i] % 2 != 0){
                System.out.println(num_array[i]);
            }
        }
    }


}