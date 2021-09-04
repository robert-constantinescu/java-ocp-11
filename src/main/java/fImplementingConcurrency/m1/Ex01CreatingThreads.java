package fImplementingConcurrency.m1;

public class Ex01CreatingThreads extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from the Ex01CreatingThreads class: " +  Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        System.out.println("1 - Main thread id: " + Thread.currentThread().getId());

        // a Runnable is a way to specify a task
        Runnable doSomething = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread: " +  Thread.currentThread().getId());
            }
        };

        // the thread will execute the run() from the Runnable interface
        Thread thread = new Thread(doSomething);
        thread.run();

        Thread thread2 =
                new Thread(() -> System.out.println(
                                "Runnable can be a lambda. " +
                                "This thread id is: " + Thread.currentThread().getId()));
        thread.start(); //start the thread
        thread2.start();

        Ex02CustomThread ex02CustomThread = new Ex02CustomThread();
        ex02CustomThread.start();

        Ex01CreatingThreads ct = new Ex01CreatingThreads();
        ct.run();
        System.out.println("1 - Main thread id: " + Thread.currentThread().getId());


    }
}
