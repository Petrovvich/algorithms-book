package ru.petrovich.algorithms.book.data.structures.stack;

public class FixedCapacityStackOfStrings {
    private String[] stringArray;
    private int cursor = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        stringArray = new String[capacity];
    }

    public boolean isEmpty() {
        return cursor == 0;
    }

    public void push(String item) {
        stringArray[cursor++] = item;
    }

    public String pop() {
        String item = stringArray[--cursor];
        stringArray[cursor] = null;
        return item;
    }
}
