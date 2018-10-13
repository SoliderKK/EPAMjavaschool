package com.epam.recursive;

public class DigitsCounter {
    public static int countDigits(int x) {
        if(x > 9 || x < -9) {
            return countDigits(x / 10) + 1;
        } else {
            return 1;
        }
    }
    public static int sumDigits(int x) {
        if(x > 9 || x < -9) {
            return sumDigits(x / 10) + Math.abs(x % 10);
        } else {
            return Math.abs(x);
        }
    }
}
