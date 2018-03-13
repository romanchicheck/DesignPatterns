package com.pandazilla.structural.decorator;

public class WhipCoffee implements Coffee {

    private Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.75;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", whip";
    }
}
