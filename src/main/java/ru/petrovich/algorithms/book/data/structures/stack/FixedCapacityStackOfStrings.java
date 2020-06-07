package ru.petrovich.algorithms.book.data.structures.stack;

public class FixedCapacityStackOfStrings implements Stack {
    private String[] stringArray;
    private int cursor = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        stringArray = new String[capacity];
    }

    @Override
    public void push(String item) {
        stringArray[cursor++] = item;
    }

    @Override
    public String pop() {
        String item = stringArray[--cursor];
        stringArray[cursor] = null;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }
}
