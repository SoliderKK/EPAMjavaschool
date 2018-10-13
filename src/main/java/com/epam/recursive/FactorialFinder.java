package com.epam.recursive;

public class FactorialFinder{
    public static int getFactorial(int n) throws IllegalArgumentException{
        if (n > 1) {
            return getFactorial(n - 1) * n;
        } else if (n >= 0) {
            return 1;
        } else {
            throw new IllegalArgumentException("Factorial of n<0 is not defined");
        }
    }
}
