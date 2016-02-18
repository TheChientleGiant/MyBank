package com.shomiimages.mybank;

import java.util.ArrayList;

/**
 * Created by Justin Dean Chien on 2/10/2016.
 */
public class BankAccount {
    private static final String TAG = "BankAccount";
    private ArrayList<Double> mTransactions;
    public static final double OVERDRAFT_FEE = 30;

    public enum Type{
        CHECKING, SAVINGS;
    }

    private Type mType;

    BankAccount(Type accountType){
        mTransactions = new ArrayList<Double>();
        mType = accountType;
    }

    public void withdraw(double amount) {
        if(mType == Type.SAVINGS){
            if (numberOfWithdrawals() >= 3){
                return;
            }
        }
        mTransactions.add(-amount);

        // Automatic overdraft fee withdrawal if balance is below 0
        if (getBalance() < 0) {
            mTransactions.add(-OVERDRAFT_FEE);
        }
    }

    private int numberOfWithdrawals(){
        int count = 0;
        for (int i = 0; i < mTransactions.size(); i++) {    //looking through transactions
            if (mTransactions.get(i) < 0){       //checking if the transaction a withdrawal
                count++;
            }
        }
        return count;
    }

    public void deposit(double amount) {
        mTransactions.add(amount);
    }

    public double getBalance() {
        double total = 0;
        for(int i =0; i<mTransactions.size(); i++){
            total += mTransactions.get(i);
        }
        return total;
    }
}
