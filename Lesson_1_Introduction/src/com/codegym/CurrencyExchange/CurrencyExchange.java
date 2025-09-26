package com.codegym.CurrencyExchange;

import java.util.Scanner;

public class CurrencyExchange {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long usd, vnd;
        
        System.out.println("Enter USD: ");
        usd = scanner.nextLong();
        vnd = usd * 26000;

        System.out.println(usd + " USD to VND: " + vnd + " VND");
    }
}
