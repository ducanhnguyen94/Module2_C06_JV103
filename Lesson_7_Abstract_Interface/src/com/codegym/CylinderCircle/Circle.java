package com.codegym.CylinderCircle;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
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

    public double getPerimeter() {
        return (Math.PI * this.radius * 2);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    
}
