package com.company;

import java.util.Scanner;

public class Task02Dawood {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number;
        double []array ;
        System.out.print("\nHow many numbers you want to enter in the array : \nAnswer : ");
        number  = sc.nextInt();
        System.out.println();
        array = new double[number];

        for(int i = 0 ; i < array.length; i++)
        {
            System.out.printf("Number %d : ", i+1);
            array[i] = sc.nextDouble();
        }

        System.out.println("\nDuplicate elements in the array are : ");
        for (int k = 0 ; k < array.length ; k++){
            for(int j = k+1 ; j < array.length ; j++ ){
                if(array[k] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
