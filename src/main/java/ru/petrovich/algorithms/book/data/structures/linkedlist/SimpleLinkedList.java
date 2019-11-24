package ru.petrovich.algorithms.book.data.structures.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Простейшая реализация связанного списка
 * Вставка элемента производится в начало списка.
 * Удаление элемента производится также из начала списка.
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
public class SimpleLinkedList {
    private Link first;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int intValue, double doubleValue) {
        Link newLink = Link.builder()
                .intData(intValue)
                .doubleData(doubleValue)
                .build();
        newLink.setNext(first);
        first = newLink;
    }

    public Link deleteFirst() throws IllegalAccessException {
        if (isEmpty()) {
            log.error("List are empty");
            throw new IllegalAccessException("List are empty");
        }
        Link tmp = first;
        first = first.getNext();
        return tmp;
    }

    public void print() {
        Link tmp = first;
        while (tmp != null) {
            tmp.print();
            tmp = tmp.getNext();
        }
    }
}
