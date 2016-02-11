package com.shomiimages.mybank;

/**
 * Created by Justin Dean Chien on 2/10/2016.
 */
public class BankAccount {
    private double balance;
    public static final double overdraftFee = 30;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
