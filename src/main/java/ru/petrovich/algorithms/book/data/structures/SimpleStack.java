package ru.petrovich.algorithms.book.data.structures;

/**
 * Реализация простейшего стека - структуры данных, организованной по принципу LIFO (Last In First Out). <br>
 * У любого пользователя этой структуры данных есть возможность получить доступ только к последнему элементу,
 * помещенному в хранилище. <br>
 */
public class SimpleStack {
    private int capacity;
    private long[] array;
    private int lastElement;

    public SimpleStack(int size) {
        capacity = size;
        array = new long[capacity];
        lastElement = -1;
    }

    /**
     * Вставка элемента в стек
     *
     * @param element элемент
     */
    public void push(long element) {
        array[++lastElement] = element;
    }

    /**
     * Получение последнего элемента из стека
     *
     * @return элемент
     */
    public long pop() {
        return array[lastElement--];
    }

    /**
     * Чтение последнего элемента из стека
     *
     * @return элемент
     */
    public long peek() {
        return array[lastElement];
    }

    /**
     * @return проверка на наличие элементов в стеке
     */
    public boolean isEmpty() {
        return (lastElement == -1);
    }

    /**
     * @return проверка на переполненность стека
     */
    public boolean isFull() {
        return (lastElement == capacity - 1);
    }
}
