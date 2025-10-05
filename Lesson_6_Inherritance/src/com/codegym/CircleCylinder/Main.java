package com.codegym.CircleCylinder;

import com.codegym.CircleCylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10);
        System.out.println(cylinder.getVolumn());
        System.out.println(cylinder.toString());
    }
}
