package com.epam.jwd.input;

import java.util.Scanner;

public class MathInput {
    public int inputFourDigitPositiveInteger(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int num;
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Invalid input. Enter 4-digit positive integer number.");
        }
        num = sc.nextInt();
        while (num < 1000 || num > 9999) {
            System.out.println("Invalid input. Enter 4-digit positive integer number.");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Invalid input. Enter 4-digit positive integer number.");
            }
            num = sc.nextInt();
        }
        return num;
    }

    public double inputDouble(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        double num;
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Invalid input. Enter positive double.");
        }
        num = sc.nextDouble();
        return num;
    }
}
