package ru.petrovich.algorithms.book.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.algorithms.sorting.SelectionSorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.petrovich.algorithms.book.TestUtils.DEFAULT_ARRAY_SIZE;
import static ru.petrovich.algorithms.book.TestUtils.generateRandomIntArray;

@SpringBootTest
class SelectionSortTest {
    @Test
    void simpleSortTest() {
        int[] testingArray = generateRandomIntArray(0, DEFAULT_ARRAY_SIZE);
        SelectionSorting instance = SelectionSorting.builder()
                .arrayToSort(testingArray)
                .arraySize(DEFAULT_ARRAY_SIZE)
                .build();
        instance.sort();
        assertNotNull(instance);
        assertNotNull(instance.getArrayToSort());
        assertEquals(DEFAULT_ARRAY_SIZE, instance.getArrayToSort().length);
    }
}
