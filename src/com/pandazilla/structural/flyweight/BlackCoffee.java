package com.pandazilla.structural.flyweight;

public class BlackCoffee implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Make black coffee, " + "hash: " + System.identityHashCode(this));
    }


}
