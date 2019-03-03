package com.training;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OperationImplMockito {

    @InjectMocks
    private static OperationImpl operationImpl;

    @Mock
    private static IOperation iOperation;

    @Test
    public void testAdd() {
        when(iOperation.add(5, 8)).thenReturn(13);
        assertEquals(operationImpl.add(5, 8), 13);
    }

    @Test
    public void testMultiply() {
        iOperation = Mockito.mock(IOperation.class);
        operationImpl = new OperationImpl(iOperation);
        when(iOperation.multiply(6, 5)).thenReturn(30);
        assertEquals(operationImpl.multiply(6, 5), 30);
    }

    @Test
    public void testDivide() {
        iOperation = Mockito.mock(IOperation.class);
        operationImpl = new OperationImpl(iOperation);
        when(iOperation.divide(10, 5)).thenReturn(2);
        assertEquals(operationImpl.divide(10, 5), 2);
    }
}