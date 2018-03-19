package com.pandazilla.behavioral.chain;

public class WebMoneyAccount extends Account{

    public WebMoneyAccount(float balance) {
        super(balance);
    }

    @Override
    public String getAccName() {
        return "WebMoney account";
    }
}
