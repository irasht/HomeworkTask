package com.training.task1;

class Pong implements Runnable {
    PingPong pingPong;

    public Pong(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    public void run() {
        synchronized (pingPong) {
            for (int i = 0; i < 100; ++i) {
                try {
                    System.out.println("Pong");
                    pingPong.notify();
                    pingPong.wait();
                } catch (InterruptedException e) {
                    System.out.println("Error");
                }
            }
            pingPong.notify();
        }
    }
}