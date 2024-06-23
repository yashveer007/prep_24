package com.ex.executorService;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        List<CallableTask> callableTasks = List.of(new CallableTask("first"),
                new CallableTask("second"),
                new CallableTask("third"));
        Future<String> firstThread = ex.submit(new CallableTask("Yashveer"));
        Future<String> secondThread = ex.submit(new CallableTask2("Little"));

        String first = firstThread.get();
        String second = secondThread.get();
        System.out.println(first);
        System.out.println(second);

        List<Future<String>> futures = ex.invokeAll(callableTasks);

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

    }
}
