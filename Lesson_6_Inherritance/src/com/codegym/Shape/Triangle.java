package com.codegym.Shape;

import com.codegym.Shape.Shape;

public class Triangle extends Shape {

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3, 0);
    }

    public double getPerimeter() {
        return super.getSide1() + super.getSide2() + super.getSide3();
    }

    public double getArea() {
        double peri = this.getPerimeter() / 2;
        double area = Math.sqrt(peri*(peri - super.getSide1())*(peri - super.getSide2())*(peri - super.getSide3()));
        return area;
    }
}
