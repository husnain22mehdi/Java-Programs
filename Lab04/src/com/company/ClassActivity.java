package com.company;

import java.util.Random;

public class ClassActivity {

    public static void main(String[] args) {

        //Making an instance of Random class
        Random rand = new Random();

        //Creating array for saving responses
        int[] response = new int[10];
        int num;

        //Initializing for loop for getting random responses
        for (int i = 1; i <= 40; i++) {

            //Creating random number between 1 to 10
            num = rand.nextInt(10) + 1;

            if (num == 1) {
                response[0] += 1;
            } else if (num == 2) {
                response[1] += 1;
            } else if (num == 3) {
                response[2] += 1;
            } else if (num == 4) {
                response[3] += 1;
            } else if (num == 5) {
                response[4] += 1;
            } else if (num == 6) {
                response[5] += 1;
            } else if (num == 7) {
                response[6] += 1;
            } else if (num == 8) {
                response[7] += 1;
            } else if (num == 9) {
                response[8] += 1;
            } else if (num == 10) {
                response[9] += 1;
            }

        }
        //Printing total number of students
        System.out.println("Total Students = 40\n");

        //Initializing for loop for printing the results
            for (int j = 1; j <= 10; j++){

                System.out.printf("%d students rated the food %d.\n", response[j-1], j);
            }

            //Printing the rating scale
        System.out.println("\nRating Scale: 1 => Awful, 10 => Excellent");
    }
}
