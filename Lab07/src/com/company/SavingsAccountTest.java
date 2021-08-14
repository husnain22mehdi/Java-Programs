package com.company;

//Creating the test class
public class SavingsAccountTest {

    //Main method
    public static void main(String[] args) {
        //Creating two objects of SavingAccounts class
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        //Setting the balance for both objects
        saver1.setSavingsBalance(3200);
        saver2.setSavingsBalance(4500);
        System.out.println("ANNUAL RATE = 4%");
        System.out.println("----------------");
        //Taking annual rate 4%
        SavingsAccount.modifyInterestRate(5);
        System.out.println("\t\t\tSaver 01\tSaver2");
        System.out.println("\t\t\t--------\t------");
        //Loop for printing our desired output
        for (int i = 0; i < 12; i++){
            saver1.setSavingsBalance(saver1.calculateTotalBalance(saver1.calculateMonthlyInterest(), saver1.getSavingBalance()));
            saver2.setSavingsBalance(saver2.calculateTotalBalance(saver2.calculateMonthlyInterest(), saver2.getSavingBalance()));
            //Printing saving balance for all 12 months for both objects
            if (i < 9) {
                System.out.printf("Month %d\t\t%.2f\t\t%.2f\n", (i + 1), saver1.getSavingBalance(), saver2.getSavingBalance());
            }else{
                System.out.printf("Month %d\t%.2f\t\t%.2f\n", (i + 1), saver1.getSavingBalance(), saver2.getSavingBalance());
            }
        }
        //Changing the annual rate to 5%
        System.out.println("\nANNUAL RATE = 5%");
        System.out.println("-----------------");
        SavingsAccount.modifyInterestRate(7);
        //Printing next month's balance for both objects
        System.out.printf("Next Month's Saver 1 balance: %.2f\n", saver1.calculateTotalBalance(saver1.calculateMonthlyInterest(), saver1.getSavingBalance()));
        System.out.printf("Next Month's Saver 2 balance: %.2f",saver2.calculateTotalBalance(saver2.calculateMonthlyInterest(), saver2.getSavingBalance()));

    }
}
