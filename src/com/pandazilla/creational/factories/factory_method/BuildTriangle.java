package com.pandazilla.creational.factories.factory_method;

import com.pandazilla.creational.factories.Shape;
import com.pandazilla.creational.factories.Triangle;

public class BuildTriangle extends BuildShape {

    @Override
    protected Shape createShape(String name, int width, int height) {
        return new Triangle(name, width, height);
    }
}
