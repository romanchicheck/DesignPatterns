package com.pandazilla.creational.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Shape shape = new Shape.ShapeBuilder(100, 100, "Square")
                .setIsSquare(true).setIsTriangle(false).setIsRectangle(false).build();
        System.out.println(shape);
    }
}
