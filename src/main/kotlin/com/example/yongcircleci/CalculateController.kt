package com.example.yongcircleci

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * @author Yong
 */
@RestController
class CalculateController(
    private val calculator: Calculator
) {

    @GetMapping("/calculate/{a}/{b}")
    fun calculate(
        @PathVariable a: Int,
        @PathVariable b: Int
    ): Int {
        return calculator.calculate(a, b)
    }
}
