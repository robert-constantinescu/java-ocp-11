package fImplementingConcurrency.m3;

public class Ex13DeadLock {

    public static void run() {
        final String resource1 = "stuck";
        final String resource2 = "forever";

        // first get a lock on resource1, and try to obtain a lock on resource 2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread1 has a lock on resource1");
                // make sure thread it's not too fast and avoids deadlock
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread1 has a lock on resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            // first get a lock on resource2, and try to obtain a lock on resource1
            synchronized (resource2) {
                System.out.println("Thread2 has a lock on resource1");
                // make sure thread it's not too fast and avoids deadlock
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread2 has a lock on resource1");
                }
            }
        });
        //start both treads
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
            run();
    }

}
