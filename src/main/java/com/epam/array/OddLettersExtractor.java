package com.epam.array;

import java.util.Arrays;

public class OddLettersExtractor {
    public static String[] extractOddLetters(char[][] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        String[] words = new String[array.length];
        Arrays.fill(words,"");
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[0].length; i++) {
                if (i % 2 == 0) {
                    words[j] += array[i][j];
                }
            }
        }
        return words;
    }
}
