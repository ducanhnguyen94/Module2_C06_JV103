package com.codegym.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double delta  = this.getDiscriminant();
        double root;
        if (delta < 0) root = 0;
        else root = ((-this.b) + Math.sqrt(delta)) / (2 * a);
        return root;   
    }

    public double getRoot2() {
        double delta  = this.getDiscriminant();
        double root;
        if (delta < 0) root = 0;
        else root = ((-this.b) - Math.sqrt(delta)) / (2 * a);
        return root;   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        double delta = equation.getDiscriminant();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();

        if (delta < 0) System.out.println("Equation has no roots!");
        else if (delta == 0) System.out.println("Equation has 1 root: " + root1);
        else System.out.println("Equation has 2 roots: " + root1 + " " + root2);
    }
}
