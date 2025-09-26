package com.codegym.Hello;

import java.util.Scanner;

public class Hello {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
