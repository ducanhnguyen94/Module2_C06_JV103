package com.codegym.Comparable.Shape;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width==" + this.width + " and length=" + this.length + ", which is a subclass of " + super.toString();
    }

    
}
