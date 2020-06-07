package ru.petrovich.algorithms.book.data.structures.queue;

/**
 * Реализация приоритетной очереди - структуры данных в которой элементы упорядочены по приоритету
 * (в данном случае по значению элемента). <br>
 */
public class SimplePriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public SimplePriorityQueue(int size) {
        maxSize = size;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
                queArray[j + 1] = item;
                nItems++;
            }
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peeMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;

    }
}
