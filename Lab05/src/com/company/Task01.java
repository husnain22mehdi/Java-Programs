package com.company;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        //Initializing arrays for representation of matrices
        int [] [] matrix_1 = new int [3] [3];
        int [] [] matrix_2 = new int [3] [3];
        int [] [] res_matrix = new int [3] [3];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        //Taking the elements of Matrix 1 as input
        System.out.println("Enter the elements of Matrix 1");

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                System.out.printf("A-%d%d: ", i+1, j+1);
                matrix_1[i][j] = sc.nextInt();

            }
        }
        System.out.println();

        //Taking the elements of Matrix 2 as input
        System.out.println("Enter the elements of Matrix 2");

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                System.out.printf("B-%d%d: ", i+1, j+1);
                matrix_2[i][j] = sc.nextInt();

            }
        }
        System.out.println();

        //Printing Matrix 1 on console
        System.out.println("Matrix 01");
        System.out.println("---------");
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                System.out.print(matrix_1[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        //Printing Matrix 2 on console
        System.out.println("Matrix 02");
        System.out.println("---------");
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                System.out.print(matrix_2[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix 01 * Matrix 02");
        System.out.println("---------------------");

        //Nested for loops for matrix multiplication
        System.out.println();
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                for (int k = 0; k < 3; k++){

                    sum = sum + matrix_1[i][k] * matrix_2[k][j];
                }
                res_matrix[i][j] = sum;
                sum = 0;
            }
        }

        //Displaying the resultant matrix i.e, output
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                System.out.print(res_matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
