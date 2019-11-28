package ru.petrovich.algorithms.book.algorithms.sorting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import ru.petrovich.algorithms.book.printing.Printable;

import javax.validation.constraints.NotNull;

/**
 * Реализация алгоритма сортировки методом слияния. <br>
 * Сложность алгоритма примерно O(N x log(N)). <br>
 * Основной недостаток сортировки методом слияния состоит в том что для работы алгоритма требуется выделение памяти
 * под дополнительный массив, равный по размерам сортируемому. При условии, что сортируемый массив достаточно большой
 * памяти может не хватить и потребуется применять другие алгоритмы. <br>
 * Основной принцип алгоритма - слияние двух предварительно отсортированных массивов.
 */
@Slf4j
@Getter
@Builder
@Validated
@AllArgsConstructor
public class MergingSorting extends SortingAlgorithm<Boolean> implements Printable {
    @NotNull
    private int[] array;
    @NotNull
    private int countElements;

    @Override
    public Boolean sort() {
        if (array.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array are empty, add elements before sort");
        }
        int[] workSpace = new int[countElements];
        mergeSort(workSpace, 0, countElements - 1);
        return true;
    }

    private void mergeSort(int[] workSpace, int lower, int upper) {
        if (lower == upper) {
            return;
        } else {
            int middle = lower + upper / 2;
            mergeSort(workSpace, lower, middle);
            mergeSort(workSpace, middle + 1, upper);
            merge(workSpace, lower, middle + 1, upper);
        }
    }

    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;
        while (lowPtr <= mid && highPtr <= upperBound)
            if (array[lowPtr] < array[highPtr]) {
                workSpace[j++] = array[lowPtr++];
            } else {
                workSpace[j++] = array[highPtr++];
            }
        while (lowPtr <= mid)
            workSpace[j++] = array[lowPtr++];
        while (highPtr <= upperBound)
            workSpace[j++] = array[highPtr++];
        for (j = 0; j < n; j++)
            array[lowerBound + j] = workSpace[j];
    }

    public void insert(int value) {
        if (array.length - 1 == countElements) {
            throw new ArrayIndexOutOfBoundsException("Array are full, remove elements before insert");
        }
        array[countElements] = value;
        countElements++;
    }

    @NotNull
    public String print() {
        return print(array);
    }
}
