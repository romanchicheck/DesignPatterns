package com.pandazilla.creational.factories.abstract_factory;

import com.pandazilla.creational.factories.Rectangle;
import com.pandazilla.creational.factories.Shape;

public class RectangleFactory implements ShapeAbstractFactory{

    private String name;
    private int width;
    private int height;

    public RectangleFactory(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape createShape() {
        return new Rectangle(name, width, height);
    }
}
