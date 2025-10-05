package com.codegym.CylinderCircle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Cylinder cylinder = new Cylinder(2,  6);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getPerimeter());
    }
}
