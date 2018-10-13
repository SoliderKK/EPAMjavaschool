package com.epam.recursive;

import java.util.Scanner;

public class RecursiveMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        System.out.println("n = " + FactorialFinder.getFactorial(scanner.nextInt()));
        System.out.println("Enter x and n:");
        System.out.println("x^n = " + PowerOf.getPowerOf(scanner.nextDouble(), scanner.nextInt()));
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Digit count is " + DigitsCounter.countDigits(x));
        System.out.println("Digit sum is " + DigitsCounter.sumDigits(x));
    }
}
