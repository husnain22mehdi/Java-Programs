package com.company;

//Creating our own class SavingAccount
public class SavingsAccount {
    //Declaring Fields
    static double annualInterestRate;
    private double savingsBalance;

    //Method for setting balance
    public void setSavingsBalance(double balance){
        savingsBalance = balance;
    }
    //Method for getting the balance
    public double getSavingBalance(){
        return savingsBalance;
    }
    //Method for modifying the interest rate
    public static void modifyInterestRate(double annual_rate){
        annualInterestRate = annual_rate;
    }
    //Method for calculating monthly interest
    public double calculateMonthlyInterest(){
        return (savingsBalance * (annualInterestRate / 100)) / 12;
    }
    //Method for calculating total balance
    public double calculateTotalBalance(double monthly_interest, double balance){
        return monthly_interest + balance;
    }

}
