package com.pandazilla.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + ": " + coffee.getCost() + "$");

        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getDescription() + ": " + coffee.getCost() + "$");

        coffee = new WhipCoffee(coffee);
        System.out.println(coffee.getDescription() + ": " + coffee.getCost() + "$");

        coffee = new VanillaCoffee(coffee);
        System.out.println(coffee.getDescription() + ": " + coffee.getCost() + "$");
    }
}
