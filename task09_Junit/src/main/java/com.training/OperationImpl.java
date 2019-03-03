package com.training;

public class OperationImpl {
    static final String WORD = "word";
    protected static final int NUMBER = 13;

    private IOperation IOperation;

    public OperationImpl() {
    }

    public OperationImpl(IOperation IOperation) {
        this.IOperation = IOperation;
    }

    public int add(int input1, int input2) {
        return IOperation.add(input1, input2);
    }

    public int multiply(int input1, int input2) {
        return IOperation.multiply(input1, input2);
    }

    public int divide(int input1, int input2) {
        return IOperation.divide(input1, input2);
    }

    public void print(String input) {
        System.out.println(input);
    }

}