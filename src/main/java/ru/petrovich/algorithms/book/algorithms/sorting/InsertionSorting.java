package ru.petrovich.algorithms.book.algorithms.sorting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import ru.petrovich.algorithms.book.printing.Printable;

import javax.validation.constraints.NotNull;

/**
 * Реализация алгоритма сортировки методом вставки применительно к массивам примитивов типа int. <br>
 * Алгоритм сортировки методом вставки имеет практически такую же как у алгоритма сортировки выбором скорость. <br>
 * Оценка алгоритма в О-нотации - О(N*N), где N - количество элементов в массиве. <br>
 */
@Slf4j
@Getter
@Builder
@Validated
@AllArgsConstructor
public class InsertionSorting extends SortingAlgorithm<Boolean> implements Printable {
    @NotNull
    private int[] arrayToSort;
    @NotNull
    private int arraySize;


    @Override
    public Boolean sort() {
        if (arrayToSort.length == 0) {
            log.error("Not enough data to sort in array");
            return false;
        }
        int in, out;
        for (out = 1; out < arraySize; out++) {
            int temp = arrayToSort[out];
            in = out;
            while (in > 0 && arrayToSort[in - 1] >= temp) {
                arrayToSort[in] = arrayToSort[in - 1];
                --in;
            }
            arrayToSort[in] = temp;
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

    @NotNull
    public String print() {
        return print(arrayToSort);
    }
}
