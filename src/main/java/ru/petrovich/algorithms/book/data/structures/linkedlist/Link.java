package ru.petrovich.algorithms.book.data.structures.linkedlist;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Реализация простейшего элемента связанного списка.
 */
@Data
@Slf4j
public class Link {
    private final int intData;
    private final double doubleData;
    private Link next;

    @Builder
    public Link(int intData, double doubleData) {
        this.intData = intData;
        this.doubleData = doubleData;
    }

    void print() {
        log.info("Integer element {}, double element {}", intData, doubleData);
    }
}
