package com.pandazilla.creational.builder;

public class Shape {

    //required params
    private int height;
    private int width;
    private String name;

    //optional params
    private boolean isSquare;
    private boolean isTriangle;
    private boolean isRectangle;

    private Shape(ShapeBuilder builder) {
        this.height = builder.height;
        this.width = builder.width;
        this.name = builder.name;
        this.isSquare = builder.isSquare;
        this.isTriangle = builder.isTriangle;
        this.isRectangle = builder.isRectangle;
    }

    public static class ShapeBuilder{
        //required params
        private int height;
        private int width;
        private String name;

        //optional params
        private boolean isSquare;
        private boolean isTriangle;
        private boolean isRectangle;

        public ShapeBuilder(int height, int width, String name) {
            this.height = height;
            this.width = width;
            this.name = name;
        }

        public ShapeBuilder setIsSquare(boolean square) {
            this.isSquare = square;
            return this;
        }

        public ShapeBuilder setIsTriangle(boolean triangle) {
            this.isTriangle = triangle;
            return this;
        }

        public ShapeBuilder setIsRectangle(boolean rectangle) {
            this.isRectangle = rectangle;
            return this;
        }

        public Shape build(){
            return new Shape(this);
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", isSquare=" + isSquare +
                ", isTriangle=" + isTriangle +
                ", isRectangle=" + isRectangle +
                '}';
    }
}
