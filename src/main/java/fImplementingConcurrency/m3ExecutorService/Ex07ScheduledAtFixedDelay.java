package fImplementingConcurrency.m3ExecutorService;

import java.util.concurrent.*;

public class Ex07ScheduledAtFixedDelay {

    private static ScheduledExecutorService scheduledExecutorService =  Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        int i = 0;
        scheduledExecutorService.scheduleWithFixedDelay
                (() -> System.out.println(i + " --- Thread id: " + Thread.currentThread().getId()),
                        3000,
                        1000,
                        TimeUnit.MILLISECONDS
                );

        try {
            //instead of shutting it down immediately, we wait 10 minutes
            scheduledExecutorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
