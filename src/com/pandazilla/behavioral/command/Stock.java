package com.pandazilla.behavioral.command;

public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buyStock(){
        System.out.println("Bought " + quantity + " " + name + " stocks");
    }

    public void sellStock(){
        System.out.println("Sold " + quantity + " " + name + " stocks");
    }
}
