package com.codegym.CylinderCircle;


public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]" + " is a subclass of " + super.toString();
    }

    
}
