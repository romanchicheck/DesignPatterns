package com.pandazilla.creational.factories.simple_factory;

import com.pandazilla.creational.factories.Rectangle;
import com.pandazilla.creational.factories.Shape;
import com.pandazilla.creational.factories.Square;
import com.pandazilla.creational.factories.Triangle;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static Shape buildShape(ShapeType type) {
        Shape shape = null;
        if (type == ShapeType.SQUARE) shape = new Square("Square", 100, 100);
        if (type == ShapeType.TRIANGLE) shape = new Triangle("Triangle", 90, 40);
        if (type == ShapeType.RECTANGLE) shape = new Rectangle("Rectangle", 100, 150);
        return shape;
    }
}
