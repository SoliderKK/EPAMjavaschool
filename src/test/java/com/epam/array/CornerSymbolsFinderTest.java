package com.epam.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornerSymbolsFinderTest {

    private char[][] array1;
    private char[][] array2;

    @Before
    public void setUp() throws Exception {
        array1 = new char[][]{
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}
        };
        array2 = new char[][] {
                {'a', 'b'},
                {'c', 'd'}
        };
    }

    @Test
    public void testGetCorners1() {
        assertArrayEquals(new char[]{'a', 'u', 'e', 'y'}, CornerSymbolsFinder.getCorners(array1));
    }

    @Test
    public void testGetCorners2() {
        assertArrayEquals(new char[]{'a', 'c', 'b', 'd'}, CornerSymbolsFinder.getCorners(array2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCornersIllegalArgumentException() {
        CornerSymbolsFinder.getCorners(new char[0][0]);
    }
}