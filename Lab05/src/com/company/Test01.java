package com.company;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int index = -1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Find index of which element: ");
        int num = sc.nextInt();

        for (int i = 0; i < 5; i++){

            if (arr[i] == num){
                index = i;
            }
        }

        System.out.println("Index: " + index);
    }
}
