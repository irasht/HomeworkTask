package com.training.task1;

class Ping implements Runnable {
    PingPong pingPong;

    public Ping(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    public void run() {
        synchronized (pingPong) {
            for (int i = 0; i < 100; ++i) {
                try {
                    System.out.print("Ping_");
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