package com.training.task4;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SumFib implements Callable<Integer> {
    int[] arr;
    int size;


    public SumFib(int size) {
        this.size = size;
        arr = new int[size];
    }

    public int getFibonacci(int n) {
        int result;
        if (n < 2) {
            arr[0] = 0;
            arr[1] = 1;
            result = n;
        } else {
            arr[n] = arr[n - 1] + arr[n - 2];
            result = arr[n];
        }
        return result;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += getFibonacci(i);
        }
        System.out.println("Fib array: " + Arrays.toString(arr));
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(15);
        System.out.println("Sum of fibonacci: " + executor.submit(new SumFib(15)).get());
    }
}
