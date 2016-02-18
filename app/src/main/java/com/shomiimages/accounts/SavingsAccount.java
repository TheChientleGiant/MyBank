package com.shomiimages.accounts;

import com.shomiimages.accounts.BankAccount;

/**
 * Created by Justin Dean Chien on 2/18/2016.
 */
public class SavingsAccount extends BankAccount {
    private static final String TAG = "SavingsAccount";
    @Override
    public void withdraw(double amount) {
        if(numberOfWithdrawals() >= 3){
            return;
        }
        super.withdraw(amount);
    }
}
