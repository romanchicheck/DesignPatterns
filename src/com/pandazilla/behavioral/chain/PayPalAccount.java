package com.pandazilla.behavioral.chain;

public class PayPalAccount extends Account{

    public PayPalAccount(float balance) {
        super(balance);
    }

    @Override
    public String getAccName() {
        return "PayPal account";
    }
}
