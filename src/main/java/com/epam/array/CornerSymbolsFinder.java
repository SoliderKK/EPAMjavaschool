package com.epam.array;

public class CornerSymbolsFinder {
    public static char[] getCorners(char[][] array) throws IllegalArgumentException{
        if (array.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        char[] corners = new char[4];
        corners[0] = array[0][0];
        corners[1] = array[array.length - 1][0];
        corners[2] = array[0][array[0].length - 1];
        corners[3] = array[array.length - 1][array[0].length - 1];
        return corners;
    }
}
