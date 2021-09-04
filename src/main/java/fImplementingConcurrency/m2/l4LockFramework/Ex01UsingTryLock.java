package fImplementingConcurrency.m2.l4LockFramework;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex01UsingTryLock {

     public static int counter = 0;

    public static Lock aLock = new ReentrantLock();

    // instead of using synchronized
    public static void incrementCounter() throws InterruptedException {
        if(aLock.tryLock(4, TimeUnit.MILLISECONDS)) {
            try {
                System.out.println();
//                aLock.lock();
                int current = counter;
                counter = current + 1;
                System.out.println("After  " + counter
                        + " ----------- Current thread: " + Thread.currentThread().getId());
            }
            //using a finally block you are ensuring resources will always be unlocked
            // in case an exception occur
            finally {
                // if you don't unlock it, the thread will run forever
                // and there is no way for other threads to access this resources
                aLock.unlock();
            }
        } else {
            System.out.println("Thread ----  " + Thread.currentThread().getId()
                    + "   ------  DOES SOMETHING ELSE");
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(() -> {
                try {
                    Ex01UsingTryLock.incrementCounter();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            t1.start();
        }
    }

}
