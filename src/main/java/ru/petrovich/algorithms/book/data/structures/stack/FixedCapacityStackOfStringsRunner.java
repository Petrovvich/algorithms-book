package ru.petrovich.algorithms.book.data.structures.stack;

import java.util.Scanner;

public class FixedCapacityStackOfStringsRunner {

    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);
        FixedCapacityStackOfStrings stackOfStrings = new FixedCapacityStackOfStrings(10);
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
