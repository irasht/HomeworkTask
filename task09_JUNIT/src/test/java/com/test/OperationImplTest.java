package com.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class OperationImplTest {
    private IOperation iOperation;
    private OperationImpl operation;


    @BeforeAll
    public static void setUpClass() throws Exception {
        System.out.println("Executes just once");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Runs before the test");
        iOperation = Mockito.mock(IOperation.class);
        operation = new OperationImpl(iOperation);
    }

    @Test
    public void testUpdate() throws FileNotFoundException {
        System.out.println("Inside void method test");
        PrintStream printStream;
        printStream = Mockito.spy(new PrintStream("file.txt"));
        printStream.print("printed word");
    }

}
