package com.company;
import java.util.Random;

public class ClassAcrivity {

    public static void main(String[] args) {

        int int_rand;
        int num;

        Random rand = new Random();

        int [] frequency = new int[6];

        for (int i = 1; i <= 6000; i++){

            int_rand = rand.nextInt(6);
            num = int_rand + 1;
            if (num == 1){
                frequency[0] += 1;
            }
            else if (num == 2){
                frequency[1] += 1;
            }
            else if (num == 3){
                frequency[2] += 1;
            }
            else if (num == 4){
                frequency[3] += 1;
            }
            else if (num == 5){
                frequency[4] += 1;
            }
            else if (num == 6){
                frequency[5] += 1;
            }

        }
        System.out.println("Frequency");
        for (int i = 1; i <= 6; i++){
            System.out.printf("%d => %d", i, frequency[i-1]);
            System.out.println();
        }
    }
}
