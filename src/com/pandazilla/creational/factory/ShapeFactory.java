package com.pandazilla.creational.factory;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape buildShape(ShapeType type) {
        if (type == ShapeType.SQUARE) return new Square("Square", 100, 100);
        if (type == ShapeType.TRIANGLE) return new Triangle("Triangle", 90, 40);
        if (type == ShapeType.RECTANGLE) return new Rectangle("Rectangle", 100, 150);
        return null;
    }
}
