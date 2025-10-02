package com.codegym.ThucHanh;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(2,2);
        rectangle.setColor("red");
        rectangle.setFilled(false);
        System.out.println(rectangle.toString());
    }
}
