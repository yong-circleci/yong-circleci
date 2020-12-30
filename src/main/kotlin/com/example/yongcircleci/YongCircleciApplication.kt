package com.example.yongcircleci

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class YongCircleciApplication

fun main(args: Array<String>) {
    runApplication<YongCircleciApplication>(*args)
}


@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello() = "hello"
}
