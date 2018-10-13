package com.epam.recursive;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialFinderTest {

    @Test
    public void testGetFactorial1() {
        assertEquals(1, FactorialFinder.getFactorial(0));
    }

    @Test
    public void testGetFactorial2() {
        assertEquals(6, FactorialFinder.getFactorial(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialWithIllegalArgumentException() {
        FactorialFinder.getFactorial(-1);
    }
}