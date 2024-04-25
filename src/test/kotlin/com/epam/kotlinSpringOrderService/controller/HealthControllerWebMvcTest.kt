package com.epam.kotlinSpringOrderService.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(HealthController::class)
class HealthControllerWebMvcTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun whenGetCalled_thenShouldBadReqeust() {
        mockMvc.perform(get("/health-check"))
            .andExpect(status().isOk)
            .andExpect(content().string("Kotlin Spring Order Service Healthy1"))
    }
}