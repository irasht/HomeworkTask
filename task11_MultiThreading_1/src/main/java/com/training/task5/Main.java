package com.training.task5;

public class Main {
    public static void main(String[] args) {
        ThreadsSleeping randomSleep = new ThreadsSleeping(4);
        new Thread(randomSleep).start();
    }
}