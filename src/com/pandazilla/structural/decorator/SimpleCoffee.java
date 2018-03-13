package com.pandazilla.structural.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Black coffee";
    }

}
