package com.epam.array;

public class CheckeredWordExtractor {
    public static String extractWordLeftToRight(char[][] array) throws IllegalArgumentException {
        if (array.length != 5 || array[0].length !=5) {
            throw new IllegalArgumentException("5 x 5 array is expected");
        }
        String word = new String();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                    word += array[i][j];
                }
            }
        }
        return word;
    }
    public static String extractWordTopToBottom(char[][] array) throws IllegalArgumentException {
        if (array.length != 5 || array[0].length !=5) {
            throw new IllegalArgumentException("5 x 5 array is expected");
        }
        String word = new String();
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                    word += array[i][j];
                }
            }
        }
        return word;
    }
}
