package com.epam.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenLettersExtractorTest {

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
        array1result = new String[] {"bd", "gi", "ln", "qs", "vx"};
    }

    @Test
    public void testExtractEvenLetters() {
        assertArrayEquals(array1result, EvenLettersExtractor.extractEvenLetters(array1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractEvenLettersWithIllegalArgumentException() {
        EvenLettersExtractor.extractEvenLetters(new char[0][0]);
    }
}