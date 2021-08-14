package com.company;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        //Declaring variables being used in the program
        int identity;
        int no_of_users;
        String username;
        String key;
        int index_username = -1;
        int index_password = -1;
        String[] user_name = new String[10];
        String[] password = new String[10];

        //Creating an instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 2; j++) {

            //Asking the user if he is a user or an administrator
            System.out.print("Are you a user or administrator (0 for Administrator / 1 for User): ");
            identity = sc.nextInt();

            //This block of code runs if the person is an administrator
            if (identity == 0) {

                System.out.print("Number of users you want to register: ");
                no_of_users = sc.nextInt();

                //For loop for inputting all the data of the user into the system
                for (int i = 0; i < no_of_users; i++) {

                    System.out.printf("Enter the username of User %d: ", i + 1);
                    user_name[i] = sc.next();

                    System.out.print("Enter the password: ");
                    password[i] = sc.next();

                    System.out.println();
                }
                System.out.println("Registration Successfully Done!\n");

            //This block of code runs when the person is a user
            } else if (identity == 1) {

                System.out.println("Log-In Menu!");
                System.out.println("------------ \n");

                for (int i = 1; i <= 3; i++) {

                    //Taking input the username of the user
                    System.out.print("Username: ");
                    username = sc.next();

                    //Checking if the user is registered on the system
                    for (String name : user_name) {

                        if (username.equals(name)) {

                            //Getting the index of username
                            for (int p = 0; p < user_name.length; p++){

                                if (user_name[p].equals(username)){

                                    index_username = p;
                                    break;
                                }
                            }

                            for (int k = 0; k < 3; k++) {

                                //Taking input the password of the user
                                System.out.print("Password: ");
                                key = sc.next();

                                //Getting index of the entered password
                                for (int p = 0; p < password.length; p++){

                                    if (password[p].equals(key)){

                                        index_password = p;
                                        break;
                                    }
                                }

                                //Checking if the entered credentials of the user match with that of the system
                                for (String word : password) {

                                    if (key.equals(word) && index_username == index_password) {

                                        //Printing welcome message if the credentials match
                                        System.out.println("ACCESS GRANTED! Welcome.");
                                        System.exit(0);
                                    }else{
                                        //The user has limited number of tries
                                        System.out.println("Wrong Password! You have " + (2-k) + " attempt(s) left.");
                                        break;
                                    }
                                  }
                                }
                            //Printing warning message on entering wrong credentials. System will shut down after some wring attempts
                            System.out.println("Too Many Wrong Attempts. System is Shutting Down.");
                            System.exit(0);

                            }
                        }
                    System.out.printf("You are not registered into the system. You have %d attempt(s) left.\n", 3-i);
                    }
                System.out.println("Too Many Wrong Attempts. System is Shutting Down.");
                System.exit(0);
                }

            }
        }
    }
