package com.pandazilla.structural.decorator;

public class MilkCoffee implements Coffee{

    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with milk";
    }
}
