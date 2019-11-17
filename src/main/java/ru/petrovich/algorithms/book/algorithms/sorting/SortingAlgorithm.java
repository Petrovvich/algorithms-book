package ru.petrovich.algorithms.book.algorithms.sorting;

import ru.petrovich.algorithms.book.algorithms.Algorithm;

/**
 * Базовый класс для всех алгоритмов сортировки
 */
public abstract class SortingAlgorithm<T, R> implements Algorithm {
    /**
     * Метод сортировки, который должен имплементировать каждый из наследников класса
     * @param elements набор элементов для сортировки
     * @return результат сортировки
     */
    public abstract R sort(T elements);
}
