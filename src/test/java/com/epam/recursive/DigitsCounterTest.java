package com.epam.recursive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsCounterTest {

    @Test
    public void testCountDigits1() {
        assertEquals(9, DigitsCounter.countDigits(123456789));
    }

    @Test
    public void testCountDigits2() {
        assertEquals(3, DigitsCounter.countDigits(-321));
    }

    @Test
    public void testCountDigits3() {
        assertEquals(1, DigitsCounter.countDigits(0));
    }

    @Test
    public void testSumDigits1() {
        assertEquals(0, DigitsCounter.sumDigits(0));
    }

    @Test
    public void testSumDigits2() {
        assertEquals(6, DigitsCounter.sumDigits(-123));
    }

    @Test
    public void testSumDigits4() {
        assertEquals(15, DigitsCounter.sumDigits(12345));
    }
}