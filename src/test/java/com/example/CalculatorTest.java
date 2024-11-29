package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(6, 3);
        assertEquals(2, result);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }
}