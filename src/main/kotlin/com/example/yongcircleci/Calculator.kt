package com.example.yongcircleci

import org.springframework.stereotype.Component

/**
 * @author Yong
 */
@Component
class Calculator {
    fun calculate(a: Int, b: Int): Int {
        return a * b
    }
}
