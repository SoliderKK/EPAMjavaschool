package com.epam.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckeredWordExtractorTest {

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
    public void extractWordLeftToRight() {
        assertEquals("acegikmoqsuwy", CheckeredWordExtractor.extractWordLeftToRight(array1));
    }

    @Test
    public void extractWordTopToBottom() {
        assertEquals("akugqcmwiseoy", CheckeredWordExtractor.extractWordTopToBottom(array1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordLeftToRightWithIllegalArgumentException1() {
        CheckeredWordExtractor.extractWordLeftToRight(new char[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordTopToBottomWithIllegalArgumentException1() {
        CheckeredWordExtractor.extractWordTopToBottom(new char[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordLeftToRighWithIllegalArgumentException2() {
        CheckeredWordExtractor.extractWordLeftToRight(array2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtractWordTopToBottomWithIllegalArgumentException2() {
        CheckeredWordExtractor.extractWordTopToBottom(array2);
    }
}