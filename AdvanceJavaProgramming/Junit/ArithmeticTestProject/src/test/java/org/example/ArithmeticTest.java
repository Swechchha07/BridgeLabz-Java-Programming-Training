package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {

    Arithmetic ar = new Arithmetic();

    @Test
    void testAdd() {
        assertEquals(15, ar.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, ar.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, ar.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, ar.divide(10, 5));
    }
}