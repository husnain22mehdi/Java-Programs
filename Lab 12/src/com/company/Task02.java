package com.company;

//Importing relevant classes
import java.io.*;
import java.util.StringTokenizer;

//Creating class
public class Task02 {
    //Main method
    public static void main(String[] args) throws Exception {

        //Creating a file object 'f'
        File f = new File("textfile2.txt");
        //Creating the file called 'textfile2.txt'
        f.createNewFile();

        //Creating objects of FileWriter and BufferedWriter class to write to the file
        FileWriter fileWriter = new FileWriter(f);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //Writing to the file
        bufferedWriter.write("Automatic number-plate recognition (ANPR) is a technology that uses optical\ncharacter recognition on images to read vehicle registration plates to create\nvehicle location data. It can use existing closed-circuit television, road- rule\nenforcement cameras, or cameras specifically designed for the task. ANPR is\nused by police forces around the world for law enforcement purposes, including\nto check if a vehicle is  registered or licensed. It is also used for electronic\ntoll collection on pay-per-use roads and as a method of cataloguing the\nmovements of traffic, for example by highways agencies.");
        //Closing both the file after writing
        bufferedWriter.close();
        fileWriter.close();

        //Creating objects of FileReader and BufferedReader class to read from the file
        FileReader filereader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        String line;
        int i;
        int line_counter = 0;
        int word_counter = 0;
        //Reading lines and counting them and words simultaneously
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            line_counter++;
            StringTokenizer st = new StringTokenizer(line);
            word_counter += st.countTokens();
        }

        //Printing the output
        System.out.println();
        System.out.println("Number of lines = " + line_counter);
        System.out.println("Number of words = " + word_counter);
    }
}
