package com.epam.kotlinSpringOrderService.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "Kotlin Spring Order Service Healthy"
    }
}