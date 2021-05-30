package com.itb.wave8.demo.sorters.comparators;

import java.util.Comparator;

public class IntegerComparatorImplAsc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
