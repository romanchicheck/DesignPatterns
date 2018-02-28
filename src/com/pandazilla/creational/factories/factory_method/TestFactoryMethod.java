package com.pandazilla.creational.factories.factory_method;

public class TestFactoryMethod {

    public static void main(String[] args) {
        BuildShape shape = new BuildSquare();
        shape.buildShape("Square", 100, 100);
        shape = new BuildTriangle();
        shape.buildShape("Triangle", 90, 40);
        shape = new BuildRectangle();
        shape.buildShape("Rectangle", 100, 150);
    }
}
