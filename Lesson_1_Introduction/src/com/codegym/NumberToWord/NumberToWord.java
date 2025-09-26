package com.codegym.NumberToWord;

import java.util.Scanner;

public class NumberToWord {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] wordLast = {"","one","two","three","four","five","six","seven","eight","nine"};
    private static String[] wordLessThan20 = {"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static String[] wordSecond = {"","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    public static void main(String[] args) {
        System.out.println("Enter an integer Number less than 1000 and greater than or equal to 0: ");

        int num = scanner.nextInt();
        int remainder, first, second, last;

        if (num > 99) {
            first = num / 100;
            remainder = num % 100;
            if (remainder > 10) {
                second = remainder / 10;
                last = remainder % 10;
            } else {
                second = 0;
                last = remainder;
            }
        } else if (num > 10) {
            first = 0;
            second = num / 10;
            last = num % 10;
        } else {
            first = 0;
            second = 0;
            last = num;
        }

        if (first == 0) {
            if (second == 0) {
                System.out.println(wordLast[last]);
            } else if (second == 1) {
                System.out.println(wordLessThan20[last]);
            } else {
                System.out.println(wordSecond[second-1] + " " + wordLast[last]);
            }
        } else {
            System.out.println(wordLast[first] + " hundred " + wordSecond[second-1] + " " + wordLast[last]);
        }

    }
}
