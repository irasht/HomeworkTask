package com.training.task3;

class FibonacciTask implements Runnable {
    private final int count;

    FibonacciTask(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}