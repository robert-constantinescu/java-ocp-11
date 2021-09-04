package fImplementingConcurrency.m3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex02UsingInvokeMethod {

    public static void main(String[] args) {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        List<Callable<Integer>> callableList = new ArrayList<>();
        callableList.add(() -> 1);
        callableList.add(() -> 2);
        try {
            // invokeAny, will only executes any one tasks from the callableList
            //      but because here we use a SingleThreadExecutors:
            //          - invokeAny, will execute the first task it receives(for a SingleThreadExecutor)
            //          - it will execute the tasks, in the order they are received
            //          - that's why it will always execute 1, before t
            //          - invokeAny, will cancel all the other tasks:
            //              - as soon as the firs it receives is done
            //
            // invokeAny will return the what the Callable executes. In this case the integers 1 or 2
            System.out.println(singleThreadExecutor.invokeAny(callableList));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // if you don't shutdown the executor, application won't stop running
            singleThreadExecutor.shutdown();
        }


    }
}
