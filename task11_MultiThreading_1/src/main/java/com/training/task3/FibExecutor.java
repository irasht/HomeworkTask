package com.training.task3;

import com.training.task2.Fibonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibExecutor {
    void execute(ExecutorService executorService, int n) {
        for (int i = 1; i <= n; i++) {
            executorService.execute(new Fibonacci(i));
        }
        executorService.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        FibExecutor fibExecutor = new FibExecutor();
        System.out.println("CachedThreadPool");
        fibExecutor.execute(Executors.newCachedThreadPool(), 8);
        Thread.sleep(1000);
        System.out.println("SingleThread");
        fibExecutor.execute(Executors.newSingleThreadExecutor(), 8);
        Thread.sleep(1000);
        System.out.println("FixedThread");
        fibExecutor.execute(Executors.newFixedThreadPool(5), 8);
    }
}
