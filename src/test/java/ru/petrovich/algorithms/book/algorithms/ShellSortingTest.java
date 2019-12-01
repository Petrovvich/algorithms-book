package ru.petrovich.algorithms.book.algorithms;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.algorithms.sorting.ShellSorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.petrovich.algorithms.book.TestUtils.BIG_ARRAY_SIZE;
import static ru.petrovich.algorithms.book.TestUtils.generateRandomLongArray;

@Slf4j
@SpringBootTest
public class ShellSortingTest {
    @Test
    public void simpleTest() {
        long[] testingArray = generateRandomLongArray(BIG_ARRAY_SIZE);
        ShellSorting instance = ShellSorting.builder()
                .theArray(testingArray)
                .nElems(BIG_ARRAY_SIZE)
                .build();
        long beforeTimestamp = System.currentTimeMillis();
        assertEquals(true, instance.sort());
        long afterTimestamp = System.currentTimeMillis();
        log.info("Sorting are took {}", afterTimestamp - beforeTimestamp);
    }
}
