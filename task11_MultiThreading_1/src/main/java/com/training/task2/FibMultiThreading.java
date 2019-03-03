package com.training.task2;

public class FibMultiThreading extends Thread {
    private int count;
    public int result;

    public FibMultiThreading(int count) {
        this.count = count;
    }

    public void run() {
        if (count == 0) {
            result = 0;
        } else if (count == 1 || count == 2) {
            result = 1;
        } else {
            try {
                FibMultiThreading f1 = new FibMultiThreading(count - 1);
                FibMultiThreading f2 = new FibMultiThreading(count - 2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                result = f1.result + f2.result;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            for (int count = 0; count < 10; count++) {
                FibMultiThreading fibMultiThreading = new FibMultiThreading(count);
                fibMultiThreading.start();
                fibMultiThreading.join();
                System.out.println(count + "th" + " SumFib № = " + fibMultiThreading.result);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

}