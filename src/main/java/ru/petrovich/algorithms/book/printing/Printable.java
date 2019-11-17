package ru.petrovich.algorithms.book.printing;

import com.sun.istack.internal.NotNull;

/**
 * Интерфейс для вывода элементов на экран
 */
public interface Printable<T> {
    @NotNull
    String print(@NotNull T element);
}
