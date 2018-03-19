package com.pandazilla.behavioral.chain;

public class ChainTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(300);
        PayPalAccount payPalAccount = new PayPalAccount(400);
        WebMoneyAccount webMoneyAccount = new WebMoneyAccount(600);

        bankAccount.setNext(payPalAccount);
        payPalAccount.setNext(webMoneyAccount);

        bankAccount.pay(500);
    }

}
