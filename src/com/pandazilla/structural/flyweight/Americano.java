package com.pandazilla.structural.flyweight;

public class Americano implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Make americano, " + "hash: " + System.identityHashCode(this));
    }
}
