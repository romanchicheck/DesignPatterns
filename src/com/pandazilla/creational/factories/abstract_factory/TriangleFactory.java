package com.pandazilla.creational.factories.abstract_factory;

import com.pandazilla.creational.factories.Shape;
import com.pandazilla.creational.factories.Triangle;

public class TriangleFactory implements ShapeAbstractFactory{

    private String name;
    private int width;
    private int height;

    public TriangleFactory(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape createShape() {
        return new Triangle(name, width, height);
    }
}
