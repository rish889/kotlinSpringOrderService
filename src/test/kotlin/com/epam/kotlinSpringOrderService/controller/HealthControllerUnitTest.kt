package com.epam.kotlinSpringOrderService.controller

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HealthControllerUnitTest {

    val healthController = HealthController();

    @Test
    fun whenGetCalled_thenShouldBadReqeust() {
        val result = healthController.healthCheck();
        assertEquals("Kotlin Spring Order Service Healthy", result)
    }
}