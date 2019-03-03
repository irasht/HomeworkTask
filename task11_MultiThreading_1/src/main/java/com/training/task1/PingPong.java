package com.training.task1;

class PingPong {
    public static void main(String[] argv) {
        PingPong t = new PingPong();
        t.play();
    }

    public void play() {
        Thread m_ping = new Thread(new Ping(this));
        Thread m_pong = new Thread(new Pong(this));

        m_ping.start();
        m_pong.start();
    }
}

