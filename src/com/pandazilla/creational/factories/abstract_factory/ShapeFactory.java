package com.pandazilla.creational.factories.abstract_factory;

import com.pandazilla.creational.factories.Shape;

public class ShapeFactory {

    public static Shape getShape(ShapeAbstractFactory shapeAbstractFactory) {
        return shapeAbstractFactory.createShape();
    }
}
