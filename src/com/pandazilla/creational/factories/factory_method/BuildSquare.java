package com.pandazilla.creational.factories.factory_method;

import com.pandazilla.creational.factories.Shape;
import com.pandazilla.creational.factories.Square;

public class BuildSquare extends BuildShape {

    @Override
    protected Shape createShape(String name, int width, int height) {
        return new Square(name, width, height);
    }
}
