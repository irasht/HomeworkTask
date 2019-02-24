package com.training;

public class Dog {
    @NameAnnotation(name = "Lewko")
    private String name;
    private String breed;

    public Dog() {
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String methodOne(String name) {
        return name + " : methodOne ";
    }

    public String methodTwo(int number) {
        return number + " : methodTwo ";
    }

    public String methodThree(double number) {
        return number + " : methodThree ";
    }

    public String myMethod(String a, int... args) {
        return a + " - " + args + " : myMethod";
    }

    public String myMethodOne(String... args) {
        return args + " : myMethodOne";
    }
    private void privateMethod() {
        System.out.println("privateMethod()");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
