package fImplementingConcurrency.m1;

public class Ex02CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from the CustomThread class: " +  Thread.currentThread().getId());
    }
}
