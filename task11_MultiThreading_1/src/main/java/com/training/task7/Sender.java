package com.training.task7;

import java.io.PipedWriter;
import java.util.Random;

class Sender extends Thread {
    private Random rand = new Random();
    private PipedWriter out = new PipedWriter();

    public PipedWriter getPipedWriter() {
        return out;
    }

    public void run() {
        while (true) {
            System.out.println("***Write***");
            for (char c = 'A'; c <= 'z'; c++) {
                try {
                    out.write(c);
                    sleep(rand.nextInt(250));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}