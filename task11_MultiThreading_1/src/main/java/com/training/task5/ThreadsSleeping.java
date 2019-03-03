package com.training.task5;

import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadsSleeping implements Runnable {
    private Random random = new Random();
    private int numberOfThreads;

    public ThreadsSleeping(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    public void run() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(numberOfThreads);
        System.out.println("Local start time : " + LocalTime.now());
        System.out.println("**************************************");
        for (int i = 0; i < numberOfThreads; i++) {
            int randomTime = random.nextInt(10) + 1;
            Runnable runnable = () -> {
                System.out.println("Sleep " + randomTime + " seconds." + " Wake up in " + LocalTime.now());
            };
            scheduledExecutorService.schedule(runnable, randomTime, TimeUnit.SECONDS);

        }
        scheduledExecutorService.shutdown();
        while (!scheduledExecutorService.isTerminated()) {
        }
        System.out.println("**************************************");
        System.out.println("Local end time : " + LocalTime.now());
    }
}
