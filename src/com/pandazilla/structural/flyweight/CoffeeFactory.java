package com.pandazilla.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class CoffeeFactory {
    private final Map<CoffeeType, Coffee> coffeeMap;

    public CoffeeFactory() {
        coffeeMap = new EnumMap<CoffeeType, Coffee>(CoffeeType.class);
    }

    public Coffee makeCoffee(CoffeeType coffeeType){
        Coffee coffee = coffeeMap.get(coffeeType);
        if(coffee == null){
            switch (coffeeType){
                case BC:
                    coffee = new BlackCoffee();
                    coffeeMap.put(coffeeType, coffee);
                    break;
                case A:
                    coffee = new Americano();
                    coffeeMap.put(coffeeType, coffee);
                    break;
                case C:
                    coffee = new Cappuccino();
                    coffeeMap.put(coffeeType, coffee);
                    break;
                case L:
                    coffee = new Latte();
                    coffeeMap.put(coffeeType, coffee);
                    break;
            }
        }
        return coffee;
    }
}
