package com.company;
import java.util.Scanner;

public class ClassAssignment03 {

    public static void main(String[] args) {

        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("1-) Deposit Cash");
        System.out.println("2-) Withdraw Cash");
        System.out.println("3-) Balance Inquiry");
        System.out.println("4-) Exit");
        System.out.println();
        System.out.print("Select an option: ");

        option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Deposit your cash");
                break;
            case 2:
                System.out.println("Withdraw your cash");
                break;
            case 3:
                System.out.println("Check your balance");
                break;
            case 4:
                System.out.println("Thank You!");
                break;
            default:
                System.out.println("Invalid Option!");

        }
        sc.close();
    }

}
