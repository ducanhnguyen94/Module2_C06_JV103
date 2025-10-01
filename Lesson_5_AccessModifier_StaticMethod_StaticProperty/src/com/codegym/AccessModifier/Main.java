package com.codegym.AccessModifier;



public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        double radius = circle.getRadius();

        System.out.println("Radius of circle: " + radius);
        circle.getArea();
    }
}
