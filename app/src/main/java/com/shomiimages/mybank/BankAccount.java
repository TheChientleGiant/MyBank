package com.shomiimages.mybank;

/**
 * Created by Justin Dean Chien on 2/10/2016.
 */
public class BankAccount {
    private static final String TAG = "BankAccount";
    private double mBalance;
    public static final double OVERDRAFT_FEE = 30;

    public void withdraw(double amount) {
        mBalance -= amount;

        if (mBalance < 0) {
            mBalance -= OVERDRAFT_FEE;
        }
    }

    public void deposit(double amount) {
        mBalance += amount;
    }

    public double getBalance() {
        return mBalance;
    }
}
