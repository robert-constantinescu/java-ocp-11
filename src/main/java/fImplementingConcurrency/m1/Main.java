package fImplementingConcurrency.m1;

public class Main {

    public static void main(String[] args) {

        Thread sleepThread = new Thread(new Ex06SleepAndInterruptedThread());
        sleepThread.start();
        // if you interrupt:
        //       - a sleeping thread, an InterruptedException will be thrown
        //       - a NON-SLEEPING thread, it will set the flag Interrupted to true
//        sleepThread.interrupt();
        //creating a new thread

        try {
            // with .join() we simply wait for the thread 'sleepThread' to finish
            //      - .join() - without arguments, wait until thread is done(this can be indefinitely)
            //      - .join(number) -  wait the number milliseconds until it starts the next execution
            sleepThread.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread sleepThread2 = new Thread(new Ex06SleepAndInterruptedThread());
        sleepThread2.start();





    }


}
