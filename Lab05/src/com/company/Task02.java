package com.company;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        int no_of_elements;
        int index_num = -1;
        int p =0;
        int q = 0;

        Scanner sc = new Scanner(System.in);

        //Taking input how many elements the user wants to enter
        System.out.print("No. of elements you want to enter in the array: ");
        no_of_elements = sc.nextInt();

        int [] duplicate_nums = new int [no_of_elements];
        int [] index_arr = new int [no_of_elements];
        int [] new_duplicate_nums = new int [duplicate_nums.length];

        //Creating an array the size of which depends on the input from the user
        int [] arr = new int [no_of_elements];

        //For loop for taking all the elements of the array as input from the user
        for (int i = 0; i < no_of_elements; i++){

            System.out.printf("Enter Num-%d: ", i+1);
            arr[i] = sc.nextInt();

        }
        System.out.println();
        System.out.println("Duplicate Numbers");
        System.out.println("-----------------");

        //Double for loops for checking if a number is repeated more than once in the array
        for (int j = 0; j < no_of_elements; j++){

            for (int k = j + 1; k < no_of_elements; k++){

                if (arr[j] == arr[k]){

                    duplicate_nums[p++] = arr[j];

                    for (int i = 0; i < duplicate_nums.length; i++){

                        if (duplicate_nums[i] == duplicate_nums[p]){

                            index_num = i;
                            index_arr[q] = index_num;
                        }
                    }q++;
                }

            }
        }

        for (int i = 0, k = 0; i < duplicate_nums.length; i++,k++){

            for (int index : index_arr){

                if (i == index){
                    continue;
                }new_duplicate_nums[k] = duplicate_nums[i];
            }
        }

        for (int num : new_duplicate_nums){

            if (num == 0){
                continue;
            }
            System.out.println(num);
        }
        System.out.println();
        for (int i : duplicate_nums){
            System.out.println(i);
        }
        System.out.println();
        for (int i : new_duplicate_nums){
            System.out.println(i);
        }
        System.out.println();
        for (int i : index_arr){
            System.out.println(i);
        }
        System.out.println();
        for (int i : arr){
            System.out.println(i);
        }
    }
}
