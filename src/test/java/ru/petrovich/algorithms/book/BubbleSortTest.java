package ru.petrovich.algorithms.book;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.algorithms.sorting.BubbleSortingAlgorithm;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static ru.petrovich.algorithms.book.TestUtils.generateRandomIntArray;

@SpringBootTest
class BubbleSortTest {

    @Test
    void simpleSortTest() {
        int[] testingArray = generateRandomIntArray(200);
        BubbleSortingAlgorithm instance = BubbleSortingAlgorithm.builder()
                .arrayToSort(testingArray)
                .arraySize(200)
                .build();
        instance.sort();
        assertNotNull(instance);
        assertNotNull(instance.getArrayToSort());
    }
}
