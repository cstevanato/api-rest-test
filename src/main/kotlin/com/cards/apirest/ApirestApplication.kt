package com.cards.apirest

import io.mongock.runner.springboot.EnableMongock
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableMongock
class ApirestApplication

fun main(args: Array<String>) {
    runApplication<ApirestApplication>(*args)
}
