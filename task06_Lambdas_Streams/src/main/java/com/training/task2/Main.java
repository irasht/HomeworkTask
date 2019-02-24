package com.training.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        commands.add(n -> System.out.println("Lambda function " + n));
        commands.add(new Executor("Method reference ")::execute);
        commands.add(new Command() {
            @Override
            public void execute(String string) {
                System.out.println("Anonymous class " + string);
            }
        });
        commands.add(new Executor("Object of class"));
        System.out.println("Please choose action");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Command as lambda function \n" +
                "2 Command as method reference \n" +
                "3 Command as anonymous class \n" +
                "4 Object of command class");
        int index = scanner.nextInt();
        switch (index) {
            case 1:
                commands.get(0).execute("run1");
                break;
            case 2:
                commands.get(1).execute("run2");
                break;
            case 3:
                commands.get(2).execute("run3");
                break;
            case 4:
                commands.get(3).execute("run4");
                break;
            default:
                System.out.println("Sorry we don't have such command ");
        }
    }
}