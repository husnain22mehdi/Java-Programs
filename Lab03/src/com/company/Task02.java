package com.company;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //Declaring variables
        byte trips;
        int kilometers_driven;
        int litres_used;
        float km_per_L;
        int total_kilometers_driven;
        int total_litres_used;
        float total_km_per_L;

        //Making instance of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input the number of trips of the car
        System.out.print("Enter the number of trips of the car: ");
        trips = sc.nextByte();

        total_kilometers_driven = 0;
        total_litres_used = 0;
        //This loop calculates the number of kilometers driven per litre
        for (int i = 1; i <= trips; i++){

            System.out.printf("Trip %d:\n-------\n", i);

            System.out.print("Number of kilometers driven: ");
            kilometers_driven = sc.nextInt();

            System.out.print("Numbers of litres used: ");
            litres_used = sc.nextInt();

            km_per_L = (float) kilometers_driven / litres_used;
            System.out.println("Numbers of kilometers per litre: " + km_per_L);
            System.out.println();

            total_kilometers_driven += kilometers_driven;
            total_litres_used += litres_used;

        }
        //Calculating data for all trips
        System.out.println("For All Trips:\n--------------");
        System.out.printf("Kilometers Driven: %d\nLiters Used: %d\n", total_kilometers_driven, total_litres_used);
        total_km_per_L = (float) total_kilometers_driven / total_litres_used;
        System.out.println("Numbers of kilometers per litre: " + total_km_per_L);

        sc.close();
    }
}
