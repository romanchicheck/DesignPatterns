package com.pandazilla.creational.factories.abstract_factory;

import com.pandazilla.creational.factories.Shape;

public class TestShapeAbstractFactory {

    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape(new SquareFactory("Square", 100, 100));
        System.out.println(square);
        Shape triangle = ShapeFactory.getShape(new TriangleFactory("Triangle", 90, 40));
        System.out.println(triangle);
        Shape rectangle = ShapeFactory.getShape(new RectangleFactory("Rectangle", 100, 150));
        System.out.println(rectangle);
    }
}
