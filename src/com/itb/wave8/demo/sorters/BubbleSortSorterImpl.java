package com.itb.wave8.demo.sorters;

import java.util.Comparator;

public class BubbleSortSorterImpl<T> implements Sorter<T> {

    public void bubbleSort(T arr[], Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> comparator) {
        this.bubbleSort(arr, comparator);
    }
}