package com.epam.array;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}
        };
        System.out.println("The corners of array are:");
        System.out.println(CornerSymbolsFinder.getCorners(array));
        System.out.println("Enter row index, start index and end index:");
        System.out.println("The extracted word is: " + WordExtractor.extractWord(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), array));
        System.out.println("Checkered extracted word left to right is:" + CheckeredWordExtractor.extractWordLeftToRight(array));
        System.out.println("Checkered extracted word top to bottom is:" + CheckeredWordExtractor.extractWordTopToBottom(array));
        String[] evenLettersWords = EvenLettersExtractor.extractEvenLetters(array);
        System.out.println("Words from even letters of each row are:");
        for (String word : evenLettersWords) {
            System.out.println(word);
        }
        String[] oddLettersWords = OddLettersExtractor.extractOddLetters(array);
        System.out.println("Words from odd letters of each column are:");
        for (String word : oddLettersWords) {
            System.out.println(word);
        }

    }
}
