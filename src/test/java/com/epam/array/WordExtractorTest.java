package com.epam.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordExtractorTest {

    private char[][] array1;

    @Before
    public void setUp() throws Exception {
        array1 = new char[][]{
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}
        };
    }

    @Test
    public void testExtractWord1() {
        assertEquals("abc", WordExtractor.extractWord(0, 0, 2, array1));
    }

    @Test
    public void testExtractWord2() {
        assertEquals("uvwxy", WordExtractor.extractWord(4, 0, 4, array1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordWithIllegalArgumentException1() {
        WordExtractor.extractWord(5, 0, 4, array1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordWithIllegalArgumentException2() {
        WordExtractor.extractWord(1, 3, 6, array1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordWithIllegalArgumentException3() {
        WordExtractor.extractWord(1, 2, 1, array1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordWithIllegalArgumentException4() {
        WordExtractor.extractWord(1, 2, 1, new char[0][0]);
    }
}