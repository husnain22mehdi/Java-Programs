package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Question02 {

    public static void main(String[] args) {

        int [] num_array = new int [4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++){

            System.out.printf("Enter Num-%d: ", i+1);
            num_array[i] = sc.nextInt();
        }
        Arrays.sort(num_array);

        System.out.println();
        System.out.println("Smallest Number: " + num_array[0]);
        System.out.print("Largest Number: " + num_array[3]);
        sc.close();
    }
}
