package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ConditionTest {
    private boolean condition=true;

    @Test
    void testMethod1() {
        assumeTrue(condition);
        System.out.println("Test method 1");
    }

    @Test
    void testMethod2() {
        assumeFalse(!condition);
        System.out.println("Test method 2");
    }
}
