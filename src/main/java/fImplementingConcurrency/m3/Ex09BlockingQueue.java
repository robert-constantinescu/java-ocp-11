package fImplementingConcurrency.m3;

import java.util.concurrent.*;

public class Ex09BlockingQueue {

    public static void main(String[] args) {

        BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.offer("Maria - 1");
        linkedBlockingQueue.offer("Maria - 2");
        linkedBlockingQueue.offer("Maria - 3");
        linkedBlockingQueue.offer("Maria - 4");

        // peek() , will check the first element in Queue
        // but it WILL NOT removed
        System.out.println(linkedBlockingQueue.peek());

        // poll() , will check the first element in Queue
        // and IT WILL removed
        System.out.println(linkedBlockingQueue.poll());

        System.out.println(linkedBlockingQueue.size());
        System.out.println(linkedBlockingQueue.contains("Maria - 4"));
        System.out.println(linkedBlockingQueue);

        //special for concurrent queues
        try {
            // try to add an element to the queue with a timeout
            // if the element can't be added, it will throw InterruptedException
            linkedBlockingQueue.offer("Jim", 1000, TimeUnit.MILLISECONDS);

            // try to retrieve the element
            linkedBlockingQueue.poll(1200, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(linkedBlockingQueue);


    }
}
