package ru.petrovich.algorithms.book;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.algorithms.sorting.BubbleSorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.petrovich.algorithms.book.TestUtils.DEFAULT_ARRAY_SIZE;
import static ru.petrovich.algorithms.book.TestUtils.generateRandomIntArray;

@SpringBootTest
class BubbleSortTest {
    @Test
    void simpleSortTest() {
        int[] testingArray = generateRandomIntArray(0, DEFAULT_ARRAY_SIZE);
        BubbleSorting instance = BubbleSorting.builder()
                .arrayToSort(testingArray)
                .arraySize(DEFAULT_ARRAY_SIZE)
                .build();
        instance.sort();
        assertNotNull(instance);
        assertNotNull(instance.getArrayToSort());
        assertEquals(DEFAULT_ARRAY_SIZE, instance.getArrayToSort().length);
    }
}
