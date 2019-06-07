package com.company.interfaces;

public class Triangle implements Shape {
    private float height;
    private float width;

    public Triangle(float height, float width){
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return 0.5 * height * width;
    }
}
