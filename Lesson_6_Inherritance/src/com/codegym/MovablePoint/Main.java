package com.codegym.MovablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2,3);
        System.out.println(point.toString());
        point.move();
        System.out.println(point.toString());
        point.move();
        System.out.println(point.toString());
    }
}
