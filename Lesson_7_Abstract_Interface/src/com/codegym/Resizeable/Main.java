package com.codegym.Resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.resize(5);
        System.out.println(circle.getRadius());
    }
}
