package ru.petrovich.algorithms.book;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.algorithms.sorting.BubbleSorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.petrovich.algorithms.book.TestUtils.generateRandomIntArray;

@SpringBootTest
class BubbleSortTest {

    @Test
    void simpleSortTest() {
        int[] testingArray = generateRandomIntArray(0, 200);
        BubbleSorting instance = BubbleSorting.builder()
                .arrayToSort(testingArray)
                .arraySize(200)
                .build();
        instance.sort();
        assertNotNull(instance);
        assertNotNull(instance.getArrayToSort());
        assertEquals(200, instance.getArrayToSort().length);
    }
}
