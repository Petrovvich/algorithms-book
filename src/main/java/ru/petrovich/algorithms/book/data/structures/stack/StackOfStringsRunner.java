package ru.petrovich.algorithms.book.data.structures.stack;

import java.util.Scanner;

public class StackOfStringsRunner {

    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);
        StackOfStrings stackOfStrings = new StackOfStrings();
        while (consoleReader.hasNext()) {
            String inputString = consoleReader.next();
            if (inputString.equalsIgnoreCase("-")) {
                stackOfStrings.pop();
            } else {
                stackOfStrings.push(inputString);
            }
        }
    }
}
