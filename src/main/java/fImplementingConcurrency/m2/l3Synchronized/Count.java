package fImplementingConcurrency.m2.l3Synchronized;

public class Count {

     public static int counter = 0;

     // why was Object instantiated here?
    public static Object anObject = new Object();

     // you can remove the synchronized and check the output
    public static void incrementCounter() {
        // this is a synchronized object(or a synchronized block)
        // this will have the same results as if we were adding 'synchronized' to the method
        synchronized (anObject) {
            int current = counter;
            //        System.out.println("Before " + counter + " ----------- Current thread: " + Thread.currentThread().getId());
            counter = current + 1;
            System.out.println("After  " + counter + " ----------- Current thread: " + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // multiple Threads can lead to something called Thread Interference
            //  - This is when a thread tries to increment a counter, while other thread is reading it
            //        - it might happen that both threads will have initial value of 2(for example
            Thread t1 = new Thread(Count::incrementCounter);
            t1.start();

        }
    }

}
