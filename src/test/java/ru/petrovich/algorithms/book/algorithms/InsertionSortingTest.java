package ru.petrovich.algorithms.book.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.algorithms.sorting.InsertionSorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.petrovich.algorithms.book.TestUtils.DEFAULT_ARRAY_SIZE;
import static ru.petrovich.algorithms.book.TestUtils.generateRandomIntArray;

@SpringBootTest
class InsertionSortingTest {
    @Test
    void simpleSortTest() {
        int[] testingArray = generateRandomIntArray(0, DEFAULT_ARRAY_SIZE);
        InsertionSorting instance = InsertionSorting.builder()
                .arrayToSort(testingArray)
                .arraySize(DEFAULT_ARRAY_SIZE)
                .build();
        instance.sort();
        assertNotNull(instance);
        assertNotNull(instance.getArrayToSort());
        assertEquals(DEFAULT_ARRAY_SIZE, instance.getArrayToSort().length);
    }
}
