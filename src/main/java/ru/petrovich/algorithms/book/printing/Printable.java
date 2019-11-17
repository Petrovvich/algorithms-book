package ru.petrovich.algorithms.book.printing;

import javax.validation.constraints.NotNull;

/**
 * Интерфейс для вывода элементов на экран
 */
public interface Printable {
    @NotNull
    default String print(int[] array) {
        if (array.length == 0) {
            return "Not enough data in array to print";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("Elements in array under ")
                    .append(i)
                    .append(" position is ")
                    .append(array[i])
                    .append("\r\n");
        }
        return sb.toString();
    }
}
