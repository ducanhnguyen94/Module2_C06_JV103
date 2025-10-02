package com.codegym.ThucHanh;

public class Circle extends Shape {
    private double radius;

    public Circle() {}

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    private double getPerimeter() {
        return (Math.PI * 2 * this.radius);
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
    }

}
