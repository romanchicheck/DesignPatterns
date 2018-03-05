package com.pandazilla.creational.prototype;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
       Shape shape = new Shape(100, 100, "Square");
       System.out.println(shape);
       Shape cloned = shape.clone();
       cloned.setName("Rectangle");
       System.out.println(cloned);
    }

}
