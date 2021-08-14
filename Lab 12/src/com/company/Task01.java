package com.company;

//Importing relevant classes
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

//Creating the class
public class Task01 {
    //Main method
    public static void main(String[] args) throws IOException{

        //Creating an instance of Scanner class
        Scanner sc = new Scanner(System.in);
        //Taking the directory path input from the user
        System.out.println("Enter directory path");
        System.out.print(">> ");
        String directory = sc.nextLine();
        //Creating a file object
        File path = new File(directory);

        //Checking whether the file object is a directory
        if (path.isDirectory()){
            //Printing folder name and files in the specified folder
            System.out.println("Folder Name = " + path.getName());
            System.out.println("Files in the folder are as follows:");
            int sr_no = 1;
            //Looping through the list of files to print all files in the folder
            for (String i : path.list()){
                System.out.println(sr_no + "-) " + i);      //Formatting the output
                sr_no++;
            }
        }
    }
}
