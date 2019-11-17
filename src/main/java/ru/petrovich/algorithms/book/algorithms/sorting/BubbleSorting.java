package ru.petrovich.algorithms.book.algorithms.sorting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import ru.petrovich.algorithms.book.printing.Printable;

import javax.validation.constraints.NotNull;

/**
 * Реализация алгоритма "пузырьковой" сортировки применительно к массивам примитивов типа int. <br>
 * Алгоритм пузырьковой сортировки является наиболее медленным алгоритмом среди существующих. <br>
 * Оценка алгоритма в О-нотации O(N*N), иными словами алгоритм имеет квадратичную сложность. <br>
 * Для полной сортировки массива требуется в общем случае N-1 проходов по массиву, где N - размер массива.
 */
@Slf4j
@Getter
@Builder
@Validated
@AllArgsConstructor
public class BubbleSorting extends SortingAlgorithm<Boolean> implements Printable {
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
        log.debug("Start sorting array with {} number of elements", arraySize);
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

    @NotNull
    public String print() {
        return print(arrayToSort);
    }
}


