package com.vaibhav.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorServiceForRunnable = Executors.newSingleThreadExecutor();
        executorServiceForRunnable.submit(new EventLoggingTask());
        executorServiceForRunnable.shutdown();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new FactorialTask(-9));
        System.out.println(future.get().intValue());
        executorService.shutdown();

    }
}
