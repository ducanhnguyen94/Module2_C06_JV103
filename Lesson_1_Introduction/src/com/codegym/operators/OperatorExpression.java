package com.codegym.operators;

import java.util.Scanner;

public class OperatorExpression {
     public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); //Nhập chiều cao

        System.out.println("Area is: " + width*height);
    }
}
