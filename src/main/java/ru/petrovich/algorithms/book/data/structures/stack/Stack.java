package ru.petrovich.algorithms.book.data.structures.stack;

public interface Stack<T> {

    void push(T item);
    T pop();
    boolean isEmpty();
}
