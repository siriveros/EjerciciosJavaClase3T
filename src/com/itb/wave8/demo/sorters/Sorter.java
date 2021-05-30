package com.itb.wave8.demo.sorters;

import java.util.Comparator;

public interface Sorter<T> {
    public void sort(T arr[], Comparator<T> comparator);
}
