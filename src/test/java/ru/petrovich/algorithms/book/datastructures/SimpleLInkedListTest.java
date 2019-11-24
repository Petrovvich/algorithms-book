package ru.petrovich.algorithms.book.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.data.structures.linkedlist.Link;
import ru.petrovich.algorithms.book.data.structures.linkedlist.SimpleLinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static ru.petrovich.algorithms.book.TestUtils.INITIAL_DOUBLE_DATA;
import static ru.petrovich.algorithms.book.TestUtils.INITIAL_INT_DATA;

@SpringBootTest
class SimpleLInkedListTest {
    private static SimpleLinkedList instance;

    @BeforeEach
    public void setUp() {
        instance = SimpleLinkedList.builder()
                .first(Link.builder()
                        .intData(INITIAL_INT_DATA)
                        .doubleData(INITIAL_DOUBLE_DATA)
                        .build())
                .build();
    }

    @Test
    void simpleTest() {
        assertNull(instance.getFirst().getNext());
        assertEquals(INITIAL_INT_DATA, instance.getFirst().getIntData());
        assertEquals(INITIAL_DOUBLE_DATA, instance.getFirst().getDoubleData());
    }

    @Test
    void simpleInsertionTest() {
        instance.insertFirst(23, 23.0d);
        assertNotNull(instance.getFirst().getNext());
        assertEquals(23, instance.getFirst().getIntData());
        assertEquals(23.0d, instance.getFirst().getDoubleData());
    }

    @Test
    void simpleDeletionTest() throws IllegalAccessException {
        instance.insertFirst(23, 23.0d);
        instance.deleteFirst();
        assertNull(instance.getFirst().getNext());
        assertEquals(INITIAL_INT_DATA, instance.getFirst().getIntData());
        assertEquals(INITIAL_DOUBLE_DATA, instance.getFirst().getDoubleData());
    }
}
