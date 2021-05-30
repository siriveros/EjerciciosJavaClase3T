package com.itb.wave8.demo;

import com.itb.wave8.demo.factories.ComparatorFactory;
import com.itb.wave8.demo.factories.SorterFactory;
import com.itb.wave8.demo.sorters.Sorter;
import com.itb.wave8.demo.timers.Timer;
import com.itb.wave8.demo.utils.DemoUtils;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {

        String palabras[] = DemoUtils.generateRandomWords(10000);

        Timer.start();
        Sorter<String> sorter = (Sorter)SorterFactory.getInstance();

        Comparator<String> comparator = (Comparator) ComparatorFactory.getInstance();

        sorter.sort(palabras, comparator);
        Timer.stop();

        System.out.println(Timer.elapsedTime());

        for (String palabra:palabras){
            System.out.println(palabra);
        }

    }
}
