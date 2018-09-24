package com.epam.homework2;

import java.util.Scanner;

public class LetterReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        String[] stringArray = string.split(" ");
        String newString = new String();
        for(String word : stringArray) {
            newString = newString.concat(new StringBuffer(word).reverse().toString() + ' ');
        }
        System.out.println(newString);
    }
}
