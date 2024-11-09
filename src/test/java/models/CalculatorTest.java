package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calc = null;

    }

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2.0, 3.0));
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(5.0, 4.0));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(4.0, 2.0));
    }

    @Test
    void testDivideByZero() {
        assertEquals(Double.NaN, calc.divide(4.0, 0));
    }
}