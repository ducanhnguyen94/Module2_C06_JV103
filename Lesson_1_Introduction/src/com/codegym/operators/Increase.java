package com.codegym.operators;

public class Increase {
    public static void main(String[] args) {
        // a++ vs ++a
        // a++ do the comparision before do the increasement 
        // ++a do the increasement before do the comparision

        int a = 3;
        if (a++ > 3) a++;
        System.out.println(a);
    }
}
