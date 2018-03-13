package com.pandazilla.structural.decorator;

public class VanillaCoffee implements Coffee{

    private Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 12.50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", vanilla: ";
    }
}
