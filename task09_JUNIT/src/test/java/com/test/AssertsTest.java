package com.test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertsTest {
    final private  boolean test = true;

    @Test
    void testAssertEquals(){
        assertEquals(test,true);
    }
    @Test
    void testAssertTrue(){
        assertTrue(test);
    }
    @Test
    void testAssertFalse(){
        assertFalse(!test);
    }
    @Test
    void testAssertNotEquals(){
        assertNotEquals(test,false);
    }
}
