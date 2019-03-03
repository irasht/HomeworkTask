package com.training.task7;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipesCommunication {

    public static void main(String[] args) throws IOException {

        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream(output);


        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Pipe1");
                output.write("Hello, pipe1!".getBytes());
            } catch (IOException e) {
            }
        });


        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Pipe2");
                int data = input.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = input.read();
                }
            } catch (IOException e) {
            }
        });

        t1.start();
        t2.start();

    }
}