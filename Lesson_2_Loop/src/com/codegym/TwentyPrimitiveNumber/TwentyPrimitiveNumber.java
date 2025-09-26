package com.codegym.TwentyPrimitiveNumber;

import java.util.Scanner;

public class TwentyPrimitiveNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Amount of primitive number: ");
        int amount = scanner.nextInt();

        int countNum = 1;
        int num = 2;

        while (countNum <= amount) {
            int countDivisor = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    countDivisor++;
                }
                if (countDivisor > 2) break;
            }
            if (countDivisor == 2) {
                System.out.println(countNum + "-" + num);
                countNum++;
                num++;
            } else num++;
        }
    }
}
