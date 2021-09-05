package fImplementingConcurrency.m3;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex12AtomicClasses {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> System.out.println(atomicInteger.incrementAndGet()));
        }
        executorService.shutdown();

    }
}
