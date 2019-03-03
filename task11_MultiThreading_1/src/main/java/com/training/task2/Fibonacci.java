package com.training.task2;

import java.util.Arrays;

public class Fibonacci extends Thread {
    int[] arr;
    int size;

    public Fibonacci(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void getFibonacci(int n) {
        if (n == 0) {
            arr[0] = 0;
        } else if (n == 1) {
            arr[1] = 1;
        } else {
            arr[n] = arr[n - 1] + arr[n - 2];
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            getFibonacci(i);
        }
        System.out.println("Fibonacci array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(20);
        f.start();
    }
}
