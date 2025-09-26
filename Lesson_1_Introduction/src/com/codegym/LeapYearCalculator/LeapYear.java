package com.codegym.LeapYearCalculator;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap Year Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        boolean leapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) leapYear = true;
            } else leapYear = true;
        }

        if (leapYear) System.out.println(year + " is a leap year!");
        else System.out.println(year + " is not a leap year!");
    }
}
