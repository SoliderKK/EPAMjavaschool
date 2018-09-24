package com.epam.lesson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringChecker {
    private String string;

    public void setString(String string) {
        this.string = string;
    }

    public char getThirdSymbol() {
        return string.charAt(2);
    }

    public char getLastSymbol() {
        return string.charAt(string.length()-1);
    }

    public char getSymbolByIndex(int index) {
        return string.charAt(index - 1);
    }

    public int getRowLenth(){
        int rowLenght = 1;
        int maxRowLength = 1;
        for(int i = 1; i < string.length(); i++) {
            if(string.toCharArray()[i] == string.toCharArray()[i - 1]) {
                rowLenght++;
            } else {
                if(rowLenght > maxRowLength) {
                    maxRowLength = rowLenght;
                }
                rowLenght = 1;
            }
        }
        return maxRowLength;
    }

    public String swapPosition(int pos1, int pos2) {
        char[] temp = string.toCharArray();
        temp[pos1 - 1] = string.toCharArray()[pos2 - 1];
        temp[pos2 - 1] = string.toCharArray()[pos1 - 1];
        return new String(temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        StringChecker stringChecker = new StringChecker();
        stringChecker.setString(scanner.nextLine());
        if(stringChecker.string.length() < 5) {
            System.out.println("String input is less than 5");
            System.exit(1);
        }
        System.out.println("Third Symbol is \'" + stringChecker.getThirdSymbol() + '\'');
        System.out.println("Last Symbol is \'" + stringChecker.getLastSymbol() + '\'');
        System.out.println("Enter k");
        try {
            int k = scanner.nextInt();
            System.out.println("Symbol at " + k + " is \'" + stringChecker.getSymbolByIndex(k) + '\'');
        } catch (InputMismatchException e) {
            System.out.println("incorrect input");
            System.exit(1);
        }
        System.out.println("Longest row is " + stringChecker.getRowLenth());
        System.out.println("Swapped string is " + stringChecker.swapPosition(2, 5));
    }

}
