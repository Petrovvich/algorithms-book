package ru.petrovich.algorithms.book.datastructures;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.data.structures.queue.SimpleQueue;
import ru.petrovich.algorithms.book.error.QueueEmptyException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleQueueTest {

    @Test
    void simpleTest() {
        SimpleQueue simpleQueue = new SimpleQueue(3);
        simpleQueue.insert(4);
        long value = simpleQueue.remove();
        assertEquals(4, value);
    }

    @Test
    void emptyQueueTest() {
        SimpleQueue simpleQueue = new SimpleQueue(3);
        Throwable error = assertThrows(QueueEmptyException.class, simpleQueue::remove);
        assertNotNull(error.getMessage());
    }
}
