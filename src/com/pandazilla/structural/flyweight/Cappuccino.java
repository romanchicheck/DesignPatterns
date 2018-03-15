package com.pandazilla.structural.flyweight;

public class Cappuccino implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Make cappuccino, " + "hash: " + System.identityHashCode(this));
    }
}
