package fImplementingConcurrency.m1;

import java.util.concurrent.Callable;

// the generic from Callable, will represent whatever or call() method will return
// the String can be replaced with any other Object
public class Ex05ImplementCallable implements Callable<String> {

    // There is no constructor for Thread, that accept a Callable
    //  the reason that this is the case is because:
    //          - the Runnable is able to run
    //          - but the Callable can be called
    // The only way to run a Callable is to use the ExecutorService

    @Override
    public String call() throws Exception {
        return "This is returned the Ex05ImplementCallable - call() method";
    }
}
