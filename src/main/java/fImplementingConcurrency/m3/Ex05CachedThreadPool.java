package fImplementingConcurrency.m3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex05CachedThreadPool {

    // we can't influence the No. of threads here
    private static ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    public static Future<Double> getRandomInFuture(int i) {
        return cachedThreadPool.submit(() -> {
            Thread.sleep((int)(Math.random() * 200));
            System.out.println("i = " + i +"     ---------   Thread id: "
                    + Thread.currentThread().getId());
            return Math.random();
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getRandomInFuture(i));
        }
        // always shutdown the executor
        cachedThreadPool.shutdown();
    }
}
