package com.epam.recursive;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTest {

    @Test
    public void testGetPowerOf1() {
        assertEquals(1, PowerOf.getPowerOf(1,1), 0.01);
    }

    @Test
    public void testGetPowerOf2() {
        assertEquals(0, PowerOf.getPowerOf(0,1000), 0.01);
    }

    @Test
    public void testGetPowerOf3() {
        assertEquals(0.008, PowerOf.getPowerOf(0.2,3), 0.01);
    }

    @Test
    public void testGetPowerOf4() {
        assertEquals(0.5, PowerOf.getPowerOf(2,-1), 0.01);
    }

    @Test
    public void testGetPowerOf5() {
        assertEquals(1, PowerOf.getPowerOf(-3,0), 0.01);
    }
}