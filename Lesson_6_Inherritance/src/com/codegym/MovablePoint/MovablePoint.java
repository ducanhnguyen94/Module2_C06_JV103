package com.codegym.MovablePoint;

public class MovablePoint extends Point{
    private float xSpeed, ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getXYSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public void setXYSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void move() {
        float x = super.getX() + this.xSpeed;
        float y = super.getY() + this.ySpeed;
        super.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]" + " " + super.toString();
    }

    
}
