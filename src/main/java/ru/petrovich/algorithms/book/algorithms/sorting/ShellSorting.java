package ru.petrovich.algorithms.book.algorithms.sorting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import ru.petrovich.algorithms.book.printing.Printable;

/**
 * Сортировка Шелла хорошо подходит для массивов среднего размера — например, до нескольких тысяч элементов
 * (в зависимости от конкретной реализации). По скорости она уступает быстрой сортировке и другим алгоритмам,
 * выполняемым за время O(N × logN ), поэтому для очень больших объемов данных она не оптимальна.
 * Тем не менее сортировка Шелла заметно быстрее алгоритмов O(N 2) — таких, как сортировки методом выбора и вставок.
 * К тому же она отличается простотой реализации: код получается простым и компактным.
 */
@Slf4j
@Getter
@Builder
@Validated
@AllArgsConstructor
public class ShellSorting extends SortingAlgorithm<Boolean> implements Printable {
    private long[] theArray;
    private int nElems;

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    @Override
    public Boolean sort() {
        if (nElems == 0) {
            log.error("Not enough data to sort in array");
            return false;
        }
        int inner, outer;
        long temp;
        int h = 1;
        while (h <= nElems / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return true;
    }

}
