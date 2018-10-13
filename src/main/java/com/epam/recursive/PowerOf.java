package com.epam.recursive;

public class PowerOf {
    public static double getPowerOf(double x, int n) {
        if(n > 1) {
            return getPowerOf(x, n - 1) * x;
        } else if(n < 1) {
            return getPowerOf(x, n + 1) /x;
        } else if(n == 1) {
            return x;
        } else if(n == -1) {
            return 1 / x;
        } else {
            return 1;
        }
    }
}
