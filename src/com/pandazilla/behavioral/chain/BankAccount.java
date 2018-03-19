package com.pandazilla.behavioral.chain;

public class BankAccount extends Account{

    public BankAccount(float balance) {
        super(balance);
    }

    @Override
    public String getAccName() {
        return "Bank account";
    }
}
