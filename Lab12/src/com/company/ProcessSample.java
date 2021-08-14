package com.company;

//Importing relevant classes
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

//Creating our class
public class ProcessSample {

    //Creating method for calculating the occurrence of a specific word in a line
    public int getFrequency(String line, String word){
        StringTokenizer st = new StringTokenizer(line);
        int tokens = st.countTokens();
        int frequency = 0;

        for (int i = 0; i < tokens; i++){
            if (word.equals(st.nextToken().toLowerCase())){
                frequency++;
            }
        }
        return frequency;
    }

    //Creating a method for getting the file size
    public double getSize(File f){
        return (double) f.length()/1000;
    }
    
    //Main method
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input_location;
        File input_file = null;
        //Do while loop for the correct input file location by the user
        do{
            System.out.print("Enter input file location: \n>> ");
            input_location = sc.nextLine();
            input_file = new File(input_location);
        }while(!input_file.exists() || input_file.isDirectory());

        //Creating output file for storing output data
        String output_location;
        System.out.print("Enter file name for storing output: ");
        output_location = sc.nextLine();
        File output_file = new File(output_location);
        if (output_file.exists()){
            System.out.println("The output file already exists.");
        }else{
            output_file.createNewFile();
            System.out.println("The file was created.");
        }

        //Creating the object of our class to refer to its methods
        ProcessSample ps = new ProcessSample();
        //Opening the streams for reading and writing
        FileReader fileReader = new FileReader(input_file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("sample2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        //Writing to the specified output file
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line + "  ");
            bufferedWriter.write("[" + ps.getFrequency(line,"the") + "]");
            bufferedWriter.write(System.lineSeparator());
        }
        //Closing all streams after use
        bufferedWriter.close();
        fileWriter.close();
        bufferedReader.close();
        fileReader.close();

        //Printing the file size of output file.
        System.out.printf("The size of the output file is %.1f KiloBytes.",ps.getSize(output_file));
        
    }
}
