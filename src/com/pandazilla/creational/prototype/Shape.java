package com.pandazilla.creational.prototype;

public class Shape implements Cloneable{

    private int height;
    private int width;
    private String name;

    public Shape(int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return new Shape(height, width, name);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                '}';
    }
}
