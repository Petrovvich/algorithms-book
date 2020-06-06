package ru.petrovich.algorithms.book.datastructures;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.petrovich.algorithms.book.data.structures.stack.SimpleStack;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleStackTest {

    @Test
    void simpleTest() {
        SimpleStack simpleStack = new SimpleStack(5);
        simpleStack.push(14);
        simpleStack.push(45);
        simpleStack.push(65);
        simpleStack.push(99);
        simpleStack.push(66);
        assertEquals(14, simpleStack.pop());
        assertEquals(45, simpleStack.pop());
        assertEquals(65, simpleStack.pop());
        assertEquals(99, simpleStack.pop());
        assertEquals(66, simpleStack.pop());
    }
}
