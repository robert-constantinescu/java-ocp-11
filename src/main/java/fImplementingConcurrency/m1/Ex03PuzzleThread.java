package fImplementingConcurrency.m1;

public class Ex03PuzzleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from the PuzzleThread class: " +  Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        Ex03PuzzleThread puzzle = new Ex03PuzzleThread();
        // if you use run, you won't start a new thread.
        // Proof: both print lines have the same threadId
        puzzle.run();

        // replace run() with start() and notice what happens
        // start() creates a new thread
        puzzle.start();
        System.out.println("Hello from Main thread from PuzzleThread class: " +  Thread.currentThread().getId());

    }
}
