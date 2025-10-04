package com.codegym.Comparable.Shape;

import com.codegym.Comparable.Shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
 
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (this.radius * 2 * Math.PI);
    }

    @Override
    public String toString() {
        return "A circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
    }



    
}
