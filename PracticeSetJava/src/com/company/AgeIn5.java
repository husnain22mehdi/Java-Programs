package com.company;

import java.util.Scanner;

public class AgeIn5 {

    public static void main(String[] args) {

        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.println();
        System.out.printf("Hi, %s! How old are you? ", name);
        age = sc.nextInt();

        System.out.println();
        System.out.printf("%s, in five years you will be %d years old.\n", name, age+5);
        System.out.printf("And five years ago you were %d!", age-5);
        sc.close();
    }
}
