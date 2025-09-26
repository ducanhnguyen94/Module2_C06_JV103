package com.codegym.PrimitiveNumberLessThan100;

import java.util.Scanner;

public class PrimitiveNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number which primitive number needs to be less than: ");
        int num = scanner.nextInt();

        int primitive = 2;
        while (primitive < num) {
            int count = 0;
            for (int i = 1; i <= primitive; i++) {
                if (primitive % i == 0) count++;
                if (count > 2) break;
            }
            if (count == 2) {
                System.out.println(primitive);
            }
            primitive++;
        }
    }
}
