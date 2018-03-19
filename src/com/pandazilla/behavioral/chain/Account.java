package com.pandazilla.behavioral.chain;

public abstract class Account {

    private float balance;
    private Account account;

    public Account(float balance) {
        this.balance = balance;
    }

    public void setNext(Account account){
        this.account = account;
    }

    public void pay(float amountToPay){
        if(canPay(amountToPay)){
            System.out.println("Paid using " + getAccName());
        } else if (account != null){
            System.out.println("Cannot pay using " + getAccName() + ". Proceeding... ");
            account.pay(amountToPay);
        } else {
            System.out.println("None of the accounts have enough balance");
        }
    }


    public boolean canPay(float amount) {
        return balance >= amount;
    }

    public abstract String getAccName();
}
