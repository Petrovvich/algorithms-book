package ru.petrovich.algorithms.book.algorithms.sorting;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import ru.petrovich.algorithms.book.printing.Printable;

/**
 * Реализация алгоритма "пузырьковой" сортировки применительно к массивам примитивов типа int
 */
@Slf4j
@Getter
@Builder
@Validated
@AllArgsConstructor
public class BubbleSortingAlgorithm extends SortingAlgorithm<Boolean> implements Printable<int[]> {
    @NotNull
    private int[] arrayToSort;
    @NotNull
    private int arraySize;

    @Override
    @NotNull
    public Boolean sort() {
        if (arrayToSort.length == 0) {
            return false;
        }
        log.debug("Start sorting array with {} number of elements", arrayToSort.length);
        int out, in;
        for (out = arraySize - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arrayToSort[in] > arrayToSort[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
        return true;
    }

    /**
     * Метод замены местами двух элементов массива
     *
     * @param first  первый элемент
     * @param second второй элемент
     */
    private void swap(int first, int second) {
        log.debug("Start swap two int variables, first variable {}, second variable {}", first, second);
        int temp = arrayToSort[first];
        arrayToSort[first] = arrayToSort[second];
        arrayToSort[second] = temp;
        log.debug("Finish swap two int variables, first variable {}, second variable {}", first, second);
    }

    @Override
    @NotNull
    public String print(@NotNull int[] element) {
        if (element.length == 0) {
            return "Not enough data in array to print";
        }
        StringBuilder sb = new StringBuilder();
        log.debug("Start print array with ");
        for (int i = 0; i < element.length; i++) {
            sb.append("Elements in array under ")
                    .append(i)
                    .append(" position is ")
                    .append(element[i])
                    .append("\r\n");
        }
        return sb.toString();
    }
}


