package ru.petrovich.algorithms.book.data.structures;

import ru.petrovich.algorithms.book.error.QueueEmptyException;
import ru.petrovich.algorithms.book.error.QueueOverflowException;

/**
 * Реализация простейшей очереди - структуры данных, организованной по принципу FIFO (First In First Out). <br>
 * Помещение и извлечение элементов производится за постоянное время - О(1). <br>
 */
public class SimpleQueue {
    private int capacity, first, last, elementsSize;
    private long[] array;

    public SimpleQueue(int s) {
        capacity = s;
        array = new long[capacity];
        first = 0;
        last = -1;
        elementsSize = 0;
    }

    /**
     * Вставка элемента в очередь
     *
     * @param value элемент
     */
    public void insert(long value) {
        if (elementsSize == capacity) {
            throw new QueueOverflowException("Queue are full, delete some elements");
        }
        if (last == capacity - 1) {
            last = -1;
        }
        array[++last] = value;
        elementsSize++;
    }

    /**
     * Удаление элемента из структуры данных
     *
     * @return элемент
     */
    public long remove() {
        if (elementsSize == 0) {
            throw new QueueEmptyException("Queue are empty, insert some elements before deletion");
        }
        long temp = array[first++];
        if (first == capacity) {
            first = 0;
        }
        elementsSize--;
        return temp;
    }

    /**
     * Чтение первого элемента в очереди
     *
     * @return элемент
     */
    public long peekFront() {
        return array[first];
    }

    /**
     * @return результат проверки на наличе элементов в очереди
     */
    public boolean isEmpty() {
        return elementsSize == 0;
    }

    /**
     * @return заполнена ли очередь
     */
    public boolean isFull() {
        return (elementsSize == capacity);
    }

    /**
     * @return количество элементов в очереди
     */
    public int size() {
        return elementsSize;
    }


}
