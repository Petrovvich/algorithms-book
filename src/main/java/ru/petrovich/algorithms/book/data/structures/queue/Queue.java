package ru.petrovich.algorithms.book.data.structures.queue;

public interface Queue<T> {

    void enqueue(T item);

    T dequeue();

    boolean isEmpty();
}
