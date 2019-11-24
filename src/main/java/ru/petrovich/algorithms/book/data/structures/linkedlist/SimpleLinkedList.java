package ru.petrovich.algorithms.book.data.structures.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Простейшая реализация связанного списка
 * Вставка элемента производится в начало списка.
 * Удаление элемента производится также из начала списка.
 * Вставка и удаление элементов происходит за постоянное время (О(1)).
 * Поиск, удаление и вставка в произвольное место в списке происходит за время O(N).
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
public class SimpleLinkedList {
    private Link first;

    /**
     * Вставка первым элементом в спискок
     *
     * @param intValue    значение
     * @param doubleValue еще одно значение
     */
    public void insertFirst(int intValue, double doubleValue) {
        Link newLink = Link.builder()
                .intData(intValue)
                .doubleData(doubleValue)
                .build();
        newLink.setNext(first);
        first = newLink;
    }

    /**
     * Удаление первого элемента из списка
     *
     * @return бывший первый элемент
     * @throws IllegalAccessException если список пуст
     */
    public Link deleteFirst() throws IllegalAccessException {
        if (isEmpty()) {
            log.error("deleteFirst: list are empty");
            throw new IllegalAccessException("List are empty");
        }
        Link tmp = first;
        first = first.getNext();
        return tmp;
    }

    /**
     * Печать в лог элементов списка
     */
    public void print() {
        Link tmp = first;
        while (tmp != null) {
            tmp.print();
            tmp = tmp.getNext();
        }
    }

    /**
     * Поиск элемента в списке по ключу
     *
     * @param linKey ключ поиска
     * @return null или элемент, содержащий ключ
     * @throws IllegalAccessException если список пуст
     */
    public Link find(int linKey) throws IllegalAccessException {
        if (isEmpty()) {
            log.error("find: list are empty");
            throw new IllegalAccessException("List are empty");
        }
        Link tmp = first;
        while (tmp.getIntData() != linKey) {
            if (tmp.getNext() == null) {
                return null;
            } else {
                tmp = tmp.getNext();
            }
        }
        return tmp;
    }

    /**
     * Проверка на наличе элементов в списке
     *
     * @return есть ли элементы
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Поиск и удаление элемента по ключу
     *
     * @param key ключ элемента
     * @return элемент, содержащий ключ
     * @throws IllegalAccessException если список пуст
     */
    public Link deleteByKey(int key) throws IllegalAccessException {
        if (isEmpty()) {
            log.error("deleteByKey: list are empty");
            throw new IllegalAccessException("List are empty");
        }
        Link current = first;
        Link previous = first;
        while (current.getIntData() != key) {
            if (current.getNext() == null) {
                return null;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (current == first) {
            first = first.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        return current;
    }

}
