package com.pandazilla.structural.flyweight;

public class Latte implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Make latte, " + "hash: " + System.identityHashCode(this));
    }
}
