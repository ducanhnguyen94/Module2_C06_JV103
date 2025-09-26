package com.codegym.LoanInterestCalculator;

import java.util.Scanner;

public class LoanInterest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Loan amount: ");
        long loanAmount = scanner.nextLong();

        System.out.println("Interest/year: ");
        double interest = scanner.nextDouble();

        System.out.println("Months: ");
        int month = scanner.nextInt();

        long paidInterest = (long) (loanAmount * month * (interest/100/12));
        System.out.println("Interest needs to be paid: " + paidInterest);
    }
}
