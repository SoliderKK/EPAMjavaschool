package com.epam.array;

public class WordExtractor {
    public static String extractWord(int rowIndex, int startIndex, int endIndex, char[][] array) throws IllegalArgumentException{
        if (endIndex < startIndex) {
            throw new IllegalArgumentException("End index can not be less than start index");
        }
        if (endIndex >= array[0].length || rowIndex >= array.length ) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Emty array");
        }
        char[] word = new char[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            word[i - startIndex] = array[rowIndex][i];
        }
        return new String(word);
    }
}
