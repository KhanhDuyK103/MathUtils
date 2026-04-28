package org.example;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
class MathUtilsTest {
    @Test
    void testFactorial() {
        assertEquals(120, MathUtils.getFactorial(5));
    }
}