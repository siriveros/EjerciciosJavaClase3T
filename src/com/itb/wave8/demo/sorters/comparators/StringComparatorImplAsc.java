package com.itb.wave8.demo.sorters.comparators;

import java.util.Comparator;

public class StringComparatorImplAsc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
