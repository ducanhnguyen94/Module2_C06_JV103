package com.codegym.Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {}

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String string;
        if (this.on) {
            string = "Fan is on. Speed: " + this.speed + ". Color: " + this.color + ". Radius: " + this.radius;
        } else {
            string = "Fan is off. Color: " + this.color + ". Radius: " + this.radius;
        }
        return string;
    };

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
