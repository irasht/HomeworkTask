package com.training.task2;

public class Executor implements Command {
    private String name;

    public Executor(String name) {
        this.name = name;
    }

    @Override
    public void execute(String string) {
        System.out.println(name + string);
    }
}
