package fImplementingConcurrency.m3ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex01SingleThreadExecutor {

    public static void main(String[] args) {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        // the execute() method, takes a Runnable parameter
        // you can create the Runnable before, or inside the method
        singleThreadExecutor.execute(
                () -> System.out.println("1: " + Math.random()
                        + " Thread id: " + Thread.currentThread().getId())
        );

        singleThreadExecutor.execute(
                () -> System.out.println("2: " + Math.random()
                        + " Thread id: " + Thread.currentThread().getId())
        );

        singleThreadExecutor.execute(
                () -> System.out.println("3: " + Math.random()
                        + " Thread id: " + Thread.currentThread().getId())
        );

        singleThreadExecutor.execute(
                () -> System.out.println("4: " + Math.random()
                        + " Thread id: " + Thread.currentThread().getId())
        );
        // if you don't shutdown the executor, application won't stop running
        singleThreadExecutor.shutdown();
    }
}
