package com.training.task3;

import java.util.concurrent.*;

public class FibonacciRunnableTest {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            new Thread(new FibonacciTask(i)).start();
        }
        System.out.println("CachedThreadPool");
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 3; i < 6; i++) {
            pool.execute(new FibonacciTask(i));
        }
        pool.shutdown();

        System.out.println();
        System.out.println("FixedThreadPool");
        pool = Executors.newFixedThreadPool(5);
        for (int i = 6; i < 9; i++) {
            pool.execute(new FibonacciTask(i));
        }
        pool.shutdown();

        System.out.println();
        System.out.println("SingleThreadExecutor");
        pool = Executors.newSingleThreadExecutor();
        for (int i = 9; i < 12; i++) {
            pool.execute(new FibonacciTask(i));
        }
        pool.shutdown();
    }
}
