package com.example.yongcircleci

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author Yong
 */
internal class CalculatorTest {

    private val sut = Calculator();

    @Test
    fun `2 + 3 = 5`() {
        assertEquals(5, sut.calculate(2, 3))
    }
}
