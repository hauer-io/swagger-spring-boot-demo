package io.hauer.spring.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SwaggerApplication

fun main(args: Array<String>) {
	runApplication<SwaggerApplication>(*args)
}
