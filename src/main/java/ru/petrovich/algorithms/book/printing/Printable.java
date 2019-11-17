package ru.petrovich.algorithms.book.printing;

import com.sun.istack.internal.NotNull;

/**
 * Интерфейс для вывода элементов на экран
 */
public interface Printable {
    @NotNull
    String print();
}
