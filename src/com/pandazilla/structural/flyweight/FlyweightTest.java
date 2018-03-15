package com.pandazilla.structural.flyweight;

public class FlyweightTest {

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffeeFactory.makeCoffee(CoffeeType.BC).makeCoffee();
        coffeeFactory.makeCoffee(CoffeeType.A).makeCoffee();
        coffeeFactory.makeCoffee(CoffeeType.C).makeCoffee();
        coffeeFactory.makeCoffee(CoffeeType.L).makeCoffee();
        coffeeFactory.makeCoffee(CoffeeType.C).makeCoffee();
        coffeeFactory.makeCoffee(CoffeeType.L).makeCoffee();
    }
}
