package ru.petrovich.algorithms.book;

import java.util.Random;

/**
 * Вспомогательный класс для часто повторяющихся операций в тестах
 */
public class TestUtils {
    public static final int DEFAULT_ARRAY_SIZE = 200;

    /**
     * Генерация массива псевдослучайных чисел в заданном интервале
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
}
