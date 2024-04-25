package com.epam.kotlinSpringOrderService.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc

@WebMvcTest
class HealthControllerWebMvcTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun whenGetCalled_thenShouldBadReqeust() {
//        mockMvc.perform(get("/api/bankAccount?id=1"))
//            .andExpect(status().isOk)
//            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//            .andExpect(jsonPath("$.bankCode").value("ING"));
    }
}