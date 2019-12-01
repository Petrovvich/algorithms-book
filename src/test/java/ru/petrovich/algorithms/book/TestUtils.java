package ru.petrovich.algorithms.book;

import java.util.Random;

/**
 * Вспомогательный класс для часто повторяющихся операций в тестах
 */
public class TestUtils {
    public static final int DEFAULT_ARRAY_SIZE = 200;
    public static final int BIG_ARRAY_SIZE = 20000000;
    public static final int INITIAL_INT_DATA = 14;
    public static final double INITIAL_DOUBLE_DATA = 14.0d;

    /**
     * Генерация массива псевдослучайных чисел в заданном интервале в формате int
     *
     * @param lower  нижняя граница интервала
     * @param higher верхняя граница интервала
     * @return массив псевдослучайных чисел
     */
    public static int[] generateRandomIntArray(int lower, int higher) {
        int[] generated = new int[higher];
        for (int i = 0; i < higher; i++) {
            generated[i] = new Random().nextInt((higher - lower) + 1) + lower;
        }
        return generated;
    }

    /**
     * Генерация массива псевдослучайных чисел в заданном интервале в формате long
     *
     * @param capacity емкость массива
     * @return массив псевдослучайных чисел
     */
    public static long[] generateRandomLongArray(int capacity) {
        long[] generated = new long[capacity];
        for (int i = 0; i < capacity; i++) {
            generated[i] = new Random().nextLong();
        }
        return generated;
    }
}
