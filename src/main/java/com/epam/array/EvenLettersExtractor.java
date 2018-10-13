package com.epam.array;

import java.util.Arrays;

public class EvenLettersExtractor {
    public static String[] extractEvenLetters(char[][] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        String[] words = new String[array.length];
        Arrays.fill(words,"");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j % 2 == 1) {
                    words[i] += array[i][j];
                }
            }
        }
        return words;
    }
}
