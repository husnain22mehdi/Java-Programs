package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 'a' if you are administrator and 'b' if you are user: ");
        String person = sc.next();
        if (person.charAt(0) == 'a'){
            String [] user_names = new String[10];
            String [] passwords = new String[10];
            for (int i=0;i<10;++i){
                System.out.printf("Enter the name of student %d to register: ",i+1);
                String name = sc.next();
                System.out.printf("Enter the password of student %d: ",i+1);
                String pass = sc.next();
                user_names[i] = name;
                passwords[i] = pass;
            }
            System.out.println("You have successfully registered all the students!");
        }
        else if (person.charAt(0) == 'b'){
            String [] user_names = {"Ali","Abdullah","Husnain","Zafar","Haris","Danish","Dawood","Ajlal","Sheraz","Rehan"};
            String [] passwords = {"ali123","abdullah123","husnain123","zafar123","haris123","danish123","dawood123","ajlal123","sheraz123","rehan123"};
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your password: ");
            String pass = sc.next();
            for (int j=0;j<10;++j){
                if (name.equals(user_names[j]) && pass.equals(passwords[j])){
                    System.out.println("--------------------------------");
                    System.out.println("You are successfully logged in!!");
                    System.out.println("--------------------------------");

                }
            }

        }
    }
}
