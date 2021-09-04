package fImplementingConcurrency.m3ExecutorService;

import java.util.concurrent.*;

public class Ex06ScheduledThreadPool {

    private static ScheduledExecutorService scheduledExecutorService =  Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {

        Future<Double> doubleFuture = scheduledExecutorService.schedule
                (
                        () -> {
                            Thread.sleep((int) (Math.random() * 200));
                            System.out.println(1 + " ---------   Thread id: "
                                    + Thread.currentThread().getId());
                            return Math.random();
                        },
                        1000,
                        TimeUnit.MILLISECONDS
                );

        try {
            System.out.println(doubleFuture.get(100, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("error");
            doubleFuture.cancel(false); // cancel if it's still running
        }

        if (doubleFuture.isCancelled()) {
            System.out.println("Future was cancelled");
        }

        if (doubleFuture.isDone()) {
            //done does not mean successfully done,
            // it means that is no longer waiting for the result,
            // because it was cancelled
            System.out.println("I'm done");
        }

        //always shutdown the executor, otherwise app will not stop
        scheduledExecutorService.shutdown();


    }
}
