package com.mybooks.accounting.controller;

import com.mybooks.accounting.entity.Request;
import com.mybooks.accounting.service.CustomerRequestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(RequestController.class)
public class RequestControllerTest {

    @MockBean
    private CustomerRequestService customerRequestService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testRaiseRequest() throws Exception {
        Request request = Request.builder()
                .id(1L)
                .customerId("123")
                .date(new Date())
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        var content = objectMapper.writeValueAsString(request);

        mockMvc.perform(MockMvcRequestBuilders.post("/customer/raise")
                        .contentType(MediaType.APPLICATION_JSON).content(content))
                .andExpect(MockMvcResultMatchers.status().isOk());

        verify(customerRequestService, times(1)).raiseCustomerRequest(request);
    }
}
