package com.pandazilla.creational.factories.simple_factory;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println(ShapeFactory.buildShape(ShapeType.SQUARE));
        System.out.println(ShapeFactory.buildShape(ShapeType.TRIANGLE));
        System.out.println(ShapeFactory.buildShape(ShapeType.RECTANGLE));
    }
}
