package com.company;

import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {

        int [] [] factories = new int [4] [3];
        String [] items = {"Bio-Degradable","Non-Biodegradable","Recyclable"};
        int [] total_items = new int [3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 4; j++){

                System.out.printf("Number of %s products produced by Factory %d: ", items[i], j+1);
                factories[j][i] = sc.nextInt();
                total_items[i] += factories[j][i];

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\t\t\t\t\tFactory 01\t\tFactory 02\t\tFactory 03\t\tFactory 04");
        System.out.println("\t\t\t\t\t----------\t\t----------\t\t----------\t\t----------");


        System.out.printf("%s\t\t\t%d\t\t\t\t%d\t\t\t\t%d\t\t\t\t%d\n\n", items[0], factories[0][0], factories[1][0], factories[2][0], factories[3][0]);
        System.out.printf("%s\t\t%d\t\t\t\t%d\t\t\t\t%d\t\t\t\t%d\n\n", items[1], factories[0][1], factories[1][1], factories[2][1], factories[3][1]);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%d\t\t\t\t%d\t\t\t\t%d\n\n", items[2], factories[0][2], factories[1][2], factories[2][2], factories[3][2]);

        System.out.println();
        System.out.println("Total Bio-Degradable Items: " + total_items[0]);
        System.out.println("Total Non-Biodegradable Items: " + total_items[1]);
        System.out.println("Total Recyclable Items: " + total_items[2]);
        sc.close();
    }
}
