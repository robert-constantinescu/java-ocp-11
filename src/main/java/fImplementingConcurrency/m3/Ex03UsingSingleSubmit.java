package fImplementingConcurrency.m3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex03UsingSingleSubmit {

    private static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    public static Future<Double> getRandomInFuture() {
        return singleThreadExecutor.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Thread id: " + Thread.currentThread().getId());
            return Math.random();
        });
    }

    public static void main(String[] args) {

        Future<Double> doubleFuture = getRandomInFuture();
        int i = 0;
        // check if the future is done
        while (!doubleFuture.isDone()) {
            i++;
            // check if the future was cancelled for any reasons and then break
            if(doubleFuture.isCancelled()) {
                System.out.println("Future cancelled");
                break;
            }
            System.out.println("Waiting for Future to finish     ----------      " + i);
        }
        try {
            System.out.println(doubleFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // always shutdown the executor
        singleThreadExecutor.shutdown();


    }
}
