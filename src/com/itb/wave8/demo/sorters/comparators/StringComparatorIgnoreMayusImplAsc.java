package com.itb.wave8.demo.sorters.comparators;

import java.util.Comparator;
import java.util.Locale;

public class StringComparatorIgnoreMayusImplAsc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}
