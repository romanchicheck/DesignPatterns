package com.pandazilla.creational.factories.factory_method;

import com.pandazilla.creational.factories.Shape;

public abstract class BuildShape {

    public void buildShape(String name, int width, int height){
        Shape shape = createShape(name, width, height);
        System.out.println(shape);
    }

    protected abstract Shape createShape(String name, int width, int height);
}
