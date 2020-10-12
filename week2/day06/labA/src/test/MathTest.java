package test;

import static org.junit.jupiter.api.Assertions.*;

import math.Math;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Math")
public class MathTest {
    @Test
    void test() {
        assertEquals(7, Math.add(3,4));
        assertEquals(3, Math.subtract(7, 4));
        assertEquals(12, Math.multiply(3, 4));
        assertEquals(0.75, Math.divide(3.0, 4.0));
        assertThrows(ArithmeticException.class, () -> Math.divide(3, 0));
        assertEquals(14, Math.circumference(3, 4));
    }
}
