package com.pandazilla.creational.factories.factory_method;

import com.pandazilla.creational.factories.Rectangle;
import com.pandazilla.creational.factories.Shape;

public class BuildRectangle extends BuildShape {

    @Override
    protected Shape createShape(String name, int width, int height) {
            return new Rectangle(name, width, height);
    }
}
