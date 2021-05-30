package com.itb.wave8.demo.timers;

public class Timer {
    private static long startTime = 0L;
    private static long endTime = 0L;

    public static String  elapsedTime(){
        return "Tiempo de ejecucion: " + (endTime - startTime) + "ms";
    }

    public static void start(){
        startTime = System.currentTimeMillis();
    }

    public static void stop(){
        endTime = System.currentTimeMillis();
    }
}
