package com.epam.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddLettersExtractorTest {

    private char[][] array1;
    private String[] array1result;

    @Before
    public void setUp() throws Exception {
        array1 = new char[][]{
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}
        };
        array1result = new String[] {"aku", "blv", "cmw", "dnx", "eoy"};
    }

    @Test
    public void testExtractOddLetters() {
        assertArrayEquals(array1result, OddLettersExtractor.extractOddLetters(array1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractOddLettersWithIllegalArgumentException() {
        OddLettersExtractor.extractOddLetters(new char[0][0]);
    }
}