package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {

        int no_of_elements;

        Scanner sc = new Scanner(System.in);

        //Taking input how many elements the user wants to enter
        System.out.print("No. of elements you want to enter in the array: ");
        no_of_elements = sc.nextInt();

        //Creating an array the size of which depends on the input from the user
        int [] arr = new int [no_of_elements];

        //For loop for taking all the elements of the array as input from the user
        for (int i = 0; i < no_of_elements; i++){

            System.out.printf("Enter Num-%d: ", i+1);
            arr[i] = sc.nextInt();

        }
        System.out.println();
        Arrays.sort(arr);   //Sorting the array
        //Printing Desired Output
        System.out.println("Maximum Number: " + arr[arr.length-1]);
        System.out.println("Minimum Number: " + arr[0]);
        sc.close();
    }
}
