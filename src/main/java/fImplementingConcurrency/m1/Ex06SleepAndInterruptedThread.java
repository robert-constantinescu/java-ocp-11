package fImplementingConcurrency.m1;

public class Ex06SleepAndInterruptedThread implements Runnable {

    static int threadNo = 0;

    @Override
    public void run() {
        threadNo ++;
        for (int i = 0; i < 10; i++) {
//            System.out.println(i + " and Thread id: " + Thread.currentThread().getId());
            System.out.println("thread no:    " + threadNo);
            try {
                // sleep() throws an interrupted exception that needs to be handled
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // This is to make sure this thread still gets interrupted, because
                // if you interrupt:
                //       - a sleeping thread, an InterruptedException will be thrown
                //       - a NON-SLEEPING thread, it will set the flag Interrupted to true
                Thread.currentThread().interrupt();
                // the break is needed to interrupt the loop when an exception is thrown
                // otherwise the loop will continue execute until it's finished
                // and throw an exception each time, because we have 'interrupted' flag set to 'true'
                break;
            }
        }

    }
}
