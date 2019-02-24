package com.training;

public class Example {
    private String text;

    public Example() {
    }

    public Example(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @PrintAnnotation(text = "some text")
    public String returnText() {
        return text;
    }
}
