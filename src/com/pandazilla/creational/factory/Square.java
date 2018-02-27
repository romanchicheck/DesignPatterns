package com.pandazilla.creational.factory;

public class Square implements Shape {

    private String name;
    private int width;
    private int height;

    public Square(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int width() {
        return width;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
