package com.pandazilla.creational.factories.abstract_factory;

import com.pandazilla.creational.factories.Shape;
import com.pandazilla.creational.factories.Square;

public class SquareFactory implements ShapeAbstractFactory {

    private String name;
    private int width;
    private int height;

    public SquareFactory(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape createShape() {
        return new Square(name, width, height);
    }
}
