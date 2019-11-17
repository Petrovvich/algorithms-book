package ru.petrovich.algorithms.book;

import java.util.Random;

/**
 * Вспомогательный класс для часто повторяющихся операций в тестах
 */
class TestUtils {
    static int[] generateRandomIntArray(int size) {
        int[] generated = new int[size];
        for (int i = 0; i < size; i++) {
            generated[i] = new Random().nextInt();
        }
        return generated;
    }
}
