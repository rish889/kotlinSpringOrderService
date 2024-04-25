package com.epam.kotlinSpringOrderService.controller

import com.epam.kotlinSpringOrderService.KotlinSpringOrderServiceApplication
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(
    classes = arrayOf(KotlinSpringOrderServiceApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class HealthControllerIntegrationTest {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun whenGetCalled_thenShouldBadReqeust() {
        val result = restTemplate.getForEntity("/health-check", String::class.java);

        assertNotNull(result)
        assertEquals(HttpStatus.OK, result?.statusCode)
        assertEquals("Kotlin Spring Order Service Healthy", result?.body)
    }
}