package ru.petrovich.algorithms.book.data.structures.stack;

public class ResizingArrayStackOfStrings implements Stack<String> {
    private String[] stringArray;
    private int cursor = 0;

    public ResizingArrayStackOfStrings() {
        stringArray = new String[1];
    }

    @Override
    public void push(String item) {
        if (cursor == stringArray.length) {
            resizeArray(2 * stringArray.length);
        }
        stringArray[cursor++] = item;
    }

    @Override
    public String pop() {
        String item = stringArray[--cursor];
        stringArray[cursor] = null;
        if (cursor > 0 && cursor == stringArray.length / 4) {
            resizeArray(stringArray.length / 2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    private void resizeArray(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < cursor; i++) {
            copy[i] = stringArray[i];
        }
        stringArray = copy;
    }
}
