package ru.petrovich.algorithms.book.error;

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException(String message) {
        super(message);
    }
}