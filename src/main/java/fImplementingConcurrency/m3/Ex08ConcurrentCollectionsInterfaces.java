package fImplementingConcurrency.m3;

import java.util.concurrent.*;

public class Ex08ConcurrentCollectionsInterfaces {

    public static void main(String[] args) {
        // using this CONCURRENT collections, is not that different than using normal collections
        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Robert", "Java");
        concurrentMap.put("Dana", "C#");
        concurrentMap.put("Stefan", "Ruby");

        BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.offer("Maria");


    }
}
